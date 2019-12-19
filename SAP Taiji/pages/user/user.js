// pages/my/my.js
var e = require("../../utils/util.js"), time = require('../../utils/util.js');
var app = getApp();
var userInfo = wx.getStorageSync("userinfo");
var nickName = userInfo.nickName;
var avator = userInfo.avatarUrl;
var persistday = wx.getStorageSync("persist");
var date = e.formatDate(new Date());

import Poster from '../../component/miniprogram_dist/poster/poster';

const posterConfig = {
  jdConfig: {
    width: 750,
    height: 1334,
    backgroundColor: '#fff',
    debug: false,
    blocks: [
      {
        width: 690,
        height: 808,
        x: 30,
        y: 183,
        borderWidth: 2,
        borderColor: '#f0c2a0',
        borderRadius: 20,
      },
      {
        width: 634,
        height: 74,
        x: 59,
        y: 770,
        backgroundColor: '#fff',
        opacity: 0.5,
        zIndex: 100,
      },
    ],
    texts: [
      {
        x: 113,
        y: 61,
        baseLine: 'middle',
        text: {nickName}.nickName,
        fontSize: 32,
        color: '#8d8d8d',
      },
      {
        x: 30,
        y: 113,
        baseLine: 'top',
        text: '今日锻炼打卡',
        fontSize: 38,
        color: '#080808',
      },
      {
        x: 92,
        y: 810,
        fontSize: 38,
        baseLine: 'middle',
        text: '已经连续打卡第'+{persistday}.persistday+'天了！',
        width: 570,
        lineNum: 1,
        color: '#080808',
        zIndex: 200,
      },
      {
        x: 59,
        y: 895,
        baseLine: 'middle',
        text: [
          {
            text: date,
            fontSize: 28,
            color: '#ec1731',
          },
          {
            text: '今日练习内容',
            fontSize: 28,
            color: '#ec1731',
            marginLeft: 30,
          }
        ]
      },
      {
        x: 522,
        y: 895,
        baseLine: 'middle',
        text: '',
        fontSize: 28,
        color: '#929292',
      },
      {
        x: 59,
        y: 945,
        baseLine: 'middle',
        text: [
          {
            text: '24式简化太极拳',
            fontSize: 28,
            color: '#929292',
          },
          {
            text: '3遍',
            fontSize: 28,
            color: '#929292',
            marginLeft: 50,
          },
          {
            text: date,
            fontSize: 28,
            color: '#929292',
            marginLeft: 50,
          },
        ]
      },
      {
        x: 360,
        y: 1075,
        baseLine: 'top',
        text: '长按识别小程序码',
        fontSize: 38,
        color: '#080808',
      },
      {
        x: 360,
        y: 1133,
        baseLine: 'top',
        text: '太极大家一起打',
        fontSize: 28,
        color: '#929292',
      },
    ],
    images: [
      {
        width: 62,
        height: 62,
        x: 30,
        y: 30,
        borderRadius: 62,
        url: avator,
      },
      {
        width: 634,
        height: 634,
        x: 59,
        y: 210,
        url: 'http://wechat.luojihao.top/timg-7.jpeg',
      },
      {
        width: 220,
        height: 220,
        x: 92,
        y: 1030,
        url: 'http://wechat.luojihao.top/timg-9.jpg',
      },
      {
        width: 750,
        height: 90,
        x: 0,
        y: 1244,
        url: 'http://wechat.luojihao.top/timg-8.jpeg',
      }
    ]

  },
  demoConfig: {
    width: 750,
    height: 1000,
    backgroundColor: '#fff',
    debug: false,
    blocks: [
      {
        x: 0,
        y: 10,
        width: 750, // 如果内部有文字，由文字宽度和内边距决定
        height: 120,
        paddingLeft: 0,
        paddingRight: 0,
        borderWidth: 10,
        borderColor: 'red',
        backgroundColor: 'blue',
        borderRadius: 40,
        text: {
          text: [
            {
              text: '金额¥ 1.00',
              fontSize: 80,
              color: 'yellow',
              opacity: 1,
              marginLeft: 50,
              marginRight: 10,
            },
            {
              text: '金额¥ 1.00',
              fontSize: 20,
              color: 'yellow',
              opacity: 1,
              marginLeft: 10,
              textDecoration: 'line-through',
            },
          ],
          baseLine: 'middle',
        },
      }
    ],
    texts: [
      {
        x: 0,
        y: 180,
        text: [
          {
            text: '长标题长标题长标题长标题长标题长标题长标题长标题长标题',
            fontSize: 40,
            color: 'red',
            opacity: 1,
            marginLeft: 0,
            marginRight: 10,
            width: 200,
            lineHeight: 40,
            lineNum: 2,
          },
          {
            text: '原价¥ 1.00',
            fontSize: 40,
            color: 'blue',
            opacity: 1,
            marginLeft: 10,
            textDecoration: 'line-through',
          },
        ],
        baseLine: 'middle',
      },
      {
        x: 10,
        y: 330,
        text: '金额¥ 1.00',
        fontSize: 80,
        color: 'blue',
        opacity: 1,
        baseLine: 'middle',
        textDecoration: 'line-through',
      },
    ],
    images: [
      {
        url: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=211460773,3093720404&fm=26&gp=0.jpg',
        width: 300,
        height: 300,
        y: 450,
        x: 0,
        // borderRadius: 150,
        // borderWidth: 10,
        // borderColor: 'red',
      },
      {
        url: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=211460773,3093720404&fm=26&gp=0.jpg',
        width: 100,
        height: 100,
        y: 450,
        x: 400,
        borderRadius: 100,
        borderWidth: 10,
      },
    ],
    lines: [
      {
        startY: 800,
        startX: 10,
        endX: 300,
        endY: 800,
        width: 5,
        color: 'red',
      }
    ]

  }
}
Page({
  data: {
    defaultAvatarUrl: "/images/main/default_avatar.png",
    defaultNickName: "用户名称",
    persist:1,
    totalpractice:0,
    totaldate:0,
    latestdate:date,
    presentCount: 0,
    practiceday: 1,
    studytime: '',
    practicetime: 0,
    today_s: "",
    posterConfig: posterConfig.jdConfig,
    StatusBar: app.globalData.StatusBar,
    CustomBar: app.globalData.CustomBar,
    ColorList: app.globalData.ColorList,
  },
  onPosterSuccess(e) {
    const { detail } = e;
    wx.previewImage({
      current: detail,
      urls: [detail]
    })
  },
  onPosterFail(err) {
    console.error(err);
  },

  onLoad: function (options) {
    var that = this,
      userInfo = wx.getStorageSync("userinfo");
    var userNid = wx.getStorageSync("userid");
    console.log(userInfo)
    nickName = userInfo.nickName;
    avator = userInfo.avatarUrl;
    console.log(nickName)

    wx.request({ //位登录
      url: 'http://luojihao.top:8080/GetHistoryRecord',
      data: {
        username: userNid.openid,
      },
      method: 'POST',
      header: {
        'content-type': 'application/x-www-form-urlencoded' // 默认值
      },
      success: function (res) {
        that.setData({
          persist : res.data.persist,
          totalpractice : res.data.totalpractice,
          totaldate : res.data.totaldate,
          latestdate: res.data.latestdate.substr(0, res.data.latestdate.length - 17),
        })
        wx.setStorage({
          key: 'persist',
          data: res.data.persist
        })
      },
    })
    that.setData({ //转换完毕存储
      userInfo: userInfo,
    })
    
    wx.getSystemInfo({
      success: function (res) {
        var windowWidth = res.windowWidth * 0.5;
        that.setData({
          //圆点坐标,x为屏幕一半,y为半径与margin-top之和,px
          //后面获取的触摸坐标是px,所以这里直接用px.
          dotPoint: {
            clientX: windowWidth,
            clientY: 250
          }
        })
      }
    })
  },

  onReady: function () {


  },
  openPage: function (a) {
    var e = a.currentTarget.dataset.url;
    wx.navigateTo({
      url: e
    });
  },
  joinVip: function () { //加入VIP
    wx.navigateTo({
      url: '../vip/vip',
    })
  },
  chooseGeren: function () {
    wx.navigateTo({
      url: '../form/form',
    })
  },
  changeView: function () {
    wx.openSetting({
      success: (res) => {
        console.log("授权结果..")
        console.log(res)
        if (!res.authSetting["scope.userInfo"] || !res.authSetting["scope.userLocation"] || !res.authSetting["scope.address"] || !res.authSetting["scope.camera"]) {
          console.log(res)
        }
      }
    })
  },
  changeToHistoryView: function(){
    wx.navigateTo({
      url: '/pages/record/record',
    })
  },
  sign_in: function () {
    wx.navigateTo({
      url: '../sign_in/sign_in',
    })
  },
  onPullDownRefresh() {

  },
  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function (res) {
    if (res.from === 'button') {
      // 来自页面内转发按钮
      console.log(res.target)
    }
    return {
      title: '看看',
      path: 'pages/study/study',
      success: function (res) {
        // 转发成功
        wx.showShareMenu({
          // 要求小程序返回分享目标信息
          withShareTicket: true
        });
      },
      fail: function (res) {
        // 转发失败
      }
    }
  },
  onCreatePoster() {
    this.setData({ posterConfig: posterConfig.demoConfig }, () => {
      Poster.create(true);    // 入参：true为抹掉重新生成
    });
  },

  onCreateOtherPoster() {
    this.setData({ posterConfig: posterConfig.jdConfig }, () => {
      Poster.create(true);    // 入参：true为抹掉重新生成 
    });
  }
})

