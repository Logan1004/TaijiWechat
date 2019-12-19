const app = getApp()

Page({
  data: {
    
  },
  onLoad: function () {

  },
  goDetails:(e)=>{
    console.log(e)
    let index = e.currentTarget.dataset.index
    console.log(index)
    let name = ''
    if (index==1){
      name = "基本功"
    }else{
      name = "招式"
    }
    wx.navigateTo({
      url: '/pages/input/input?name='+name,
    })
  },
  gotoPage: function () { wx.navigateTo({ url: '/pages/input/input', }) }
})