LLongImageView
==============

longer than longer ImageView

why
==============

User's phone have different size of photos include the long image. but the android ImageView can't display it. eg the 4096 px height or width.but the most popular app like WeChat,Sina weibo can display well. I spend too much time and finally make it happen.
Special thanks to the great project https://github.com/davemorrissey/subsampling-scale-image-view.this project was based on it.


how
==============
I copy the based on project and add two sample features.

1.Support remote url display

2.scale width to fit screen

so you can use it to display a image via assets folder storage or url.
just call setImageAsset(String name),setImageFile(String path),setImageUrl(String url)
if you want fit screen.
call setFitScreen(true).


TODO
==============
make below api level 10 work
