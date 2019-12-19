var util = require('../../utils/util.js');

Page({
  data: {
    value1: '',
    value2: '',
    value3: '',
    value4: '',
    value5: '',
    value6: '',
    value7: '',
    itemList:'',
    itemIndex:0,
    unitList:'',
    unitIndex:0
  },
  onLoad:function(options){
    var that = this,
      userInfo = wx.getStorageSync("userinfo");
    var time = util.formatTime(new Date());  
    var userNid = wx.getStorageSync("userid");
    var list = [];
    var itemList = [];
    var unitList = [];
    var url = "";
    if (options.name == "基本功"){
      url = 'http://luojihao.top:8080/GetAllJibengong'
    }else{
      url = 'http://luojihao.top:8080/GetAllZhaoshi' 
    }
    
    wx.request({
      url: url,//请求地址
      header: {
        "Content-Type": "application/json"
      },
      method: 'POST',
      success: function (res) {
        list = res.data
        for (var i=0;i<list.length;i++){
          itemList.push(list[i].name)
        }
        that.setData({
          itemList: itemList
        })
        wx.setStorage({
          key: 'program',
          data: itemList
        })
      },
      fail: function (err) {
        console.log("fail")
      }
    })

    wx.request({
      url: 'http://luojihao.top:8080/GetAllUnit',//请求地址
      header: {
        "Content-Type": "application/json"
      },
      method: 'POST',
      success: function (res) {
        list = res.data
        for (var i = 0; i < list.length; i++) {
          unitList.push(list[i].name)
        }
        that.setData({
          unitList: unitList
        })
        wx.setStorage({
          key: 'unitList',
          data: unitList
        })
      },
      fail: function (err) {
        console.log("fail")
      }
    })

    that.setData({
      value1: options.name,
      value2: userInfo.nickName,
      value3: time,
    })
  },
  handleInput(e) {
    let value = this.validateNumber(e.detail.value)
    this.setData({
      value
    })
  },
  validateNumber(val) {
    return val.replace(/\D/g, '')
  },


    handleInputFocus(event) {
      this.triggerEvent('focus', event);
    },

    handleInputBlur(event) {
      this.triggerEvent('blur', event);
    },
  bindPickerChange:function(e){
    this.setData({
      itemIndex:e.detail.value
    })
  },
  bindPickerChangeUnit: function (e) {
    this.setData({
      unitIndex: e.detail.value
    })
  },
  formSubmit: function (e) {
    var userNid = wx.getStorageSync("userid");
    var items = wx.getStorageSync("program");
    var units = wx.getStorageSync("unitList");
    console.log(wx.getStorageSync("unitList"))
    console.log(e.detail)
    var index0 = Number(e.detail.value.itemId)
    var index1 = Number(e.detail.value.unitId)

    wx.request({ //位登录
      url: 'http://luojihao.top:8080/InsertRecord',
      data: {
        username: userNid.openid,
        date: util.formatTime(new Date()),
        program: items[index0],
        number:e.detail.value.num,
        unit:units[index1],
      },
      method: 'POST',
      header: {
        'content-type': 'application/x-www-form-urlencoded' // 默认值
      },
      success: function (res) {
        console.log(res)
        wx.showToast({
          title: '打卡成功',
          icon: 'success',
          duration: 1000,
          mask: true
        })
        
      },
    })
  },

});