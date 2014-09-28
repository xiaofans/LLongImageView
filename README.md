LLongImageView
==============

longer than longer ImageView

why
==============

User's phone have different size of photos include the long image. but the android ImageView can't display them. eg the 4096 px height or width.the most popular app like WeChat,Sina weibo can display well. I spend too much time and finally make that happen.
Special thanks to the great project https://github.com/davemorrissey/subsampling-scale-image-view  this project was based on it.


how
==============
I copy the based on project and add a few sample features.

1.Support remote url display

2.scale width to fit screen

3.add cache support

so you can use it to display a image via assets, folder storage or url.
just call setImageAsset(String name),setImageFile(String path),setImageUrl(String url,LLongImageLoadingListener longLoadingListener)
if you want fit screen.
call setFitScreen(true) before start loading.

demo
==============
 ![image](https://github.com/xiaofans/LLongImageView/blob/master/demo.gif)


TODO
==============
make below api level 10 work
