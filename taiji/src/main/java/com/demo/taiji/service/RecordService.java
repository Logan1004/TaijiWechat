package com.demo.taiji.service;

import com.demo.taiji.dao.ChecktableMapper;
import com.demo.taiji.dao.UserMapper;
import com.demo.taiji.models.Checktable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.DatabaseMetaData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
@Service
public class RecordService {
    @Autowired
    private UserMapper userRepo;

    @Autowired
    private ChecktableMapper recordRepo;

    public List<Checktable> GetRecordByUserId(int userid){
        List<Checktable> list =recordRepo.getRecordByUserId(userid);
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i).getDate());
//        }
        return recordRepo.getRecordByUserId(userid);
    }

    public int GetMaxItems(int userid){
        return GetRecordByUserId(userid).size();
    }

    public int GetMaxDate(int userid){
        List<Checktable> list = GetRecordByUserId(userid);
        ArrayList<Date> arrayList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (int i=0;i<list.size();i++){
            String sDate = simpleDateFormat.format(list.get(i).getDate());
            try {
                Date date = simpleDateFormat.parse(sDate);
                if (!arrayList.contains(date)){
                    arrayList.add(date);
                }
            } catch (ParseException e) {
                System.out.println("Date Error!");
            }
        }
        return arrayList.size();
    }

    public Date GetLatestDate(int userid){
        Date date = GetRecordByUserId(userid).get(0).getDate();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(simpleDateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int GetMaxLoginDate(int userid){
        List<Checktable> list = recordRepo.getRecordByUserId(userid);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        int i=0;
        int count = 0;
        while (true){
            if (i == list.size()) {
                break;
            }
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH)+1;
            int day = calendar.get(Calendar.DATE);

            String str = new SimpleDateFormat("yyyy-MM-dd").format(list.get(i).getDate());
            String[] strNow = str.split("-");
            int listYear  = Integer.parseInt(strNow[0]);
            int listMonth = Integer.parseInt(strNow[1]);
            int listDay = Integer.parseInt(strNow[2]);

            i++;
            if (listYear==year && listMonth==month && listDay == day){
                int day1 = calendar.get(Calendar.DATE);
                calendar.set(Calendar.DATE, day1 - 1);
                count++;
                i=0;
            }

        }
        return count+1;
    }

    public Checktable GetRecord(int userid,int month,int year,String content,String unit){
        List<Checktable> list = new ArrayList<>();
        if (month==0) {
            list = recordRepo.getYearRecordByUserId(userid,year,content);
        } else {
            list = recordRepo.getMonthRecordByUserId(userid,month,year,content);
        }
        int sum = 0;
        for (int i=0;i<list.size();i++){
            sum+=list.get(i).getNumber();
        }
        Checktable checktable = new Checktable();
        checktable.setDate(new Date());
        checktable.setDatemonth(month);
        checktable.setDateyear(year);
        checktable.setUserid(userid);
        checktable.setProgram(content);
        checktable.setNumber(sum);
        checktable.setUnit(unit);
        return checktable;
    }

    public int InsertRecord(String name, Date date, String program, int number,String unit){
        int userId = userRepo.getUserBywechhatId(name).getUserid();
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        String[] strNow = str.split("-");
        System.out.println(date);
//        Checktable checktable = new Checktable();
//        checktable.setUnit(unit);
//        checktable.setNumber(number);
//        checktable.setProgram(program);
//        checktable.setDate(date);
//        checktable.setDateyear(Integer.parseInt(strNow[0]));
//        checktable.setDatemonth(Integer.parseInt(strNow[1]));
//        checktable.setUserid(userId);
        return recordRepo.insertRecord(date,Integer.parseInt(strNow[1]),Integer.parseInt(strNow[0]),number,program,unit,userId);
    }


}
