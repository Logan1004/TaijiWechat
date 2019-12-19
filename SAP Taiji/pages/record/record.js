Page({
  data: {
    items: '',
    avatar: '',
  },
  onLoad: function (options) {
    var that = this,
      userInfo = wx.getStorageSync("userinfo");
    var userNid = wx.getStorageSync("userid");
    that.setData({
      userInfo: userInfo.avatarUrl
    })
    wx.request({ //位登录
      url: 'http://luojihao.top:8080/GetRecordByUserId',
      data: {
        username: userNid.openid,
      },
      method: 'POST',
      header: {
        'content-type': 'application/x-www-form-urlencoded' // 默认值
      },
      success: function (res) {
        console.log(res.data)
        for (var i=0;i<res.data.length;i++){
          res.data[i].date = res.data[i].date.substr(0, res.data[i].date.length - 18)
        }
        that.setData({
          items:res.data
        })
      },
      fail: function (err) {
        console.log("fail")
      }
    })

  }
})