# dispatchWindowInsets_bug_sample

Showcase of a layout failed bug caused by dispatchWindowInsets

https://issuetracker.google.com/144443783

 Require:
 1) Set fitsSystemWindows=true in first page's list item (layout_item1.xml)
 2) Request layout before change status bar text color (changeStatusBarText)
 
 Steps to reproduce:
 1) Refresh fragment 1
 2) Swipe to fragment 2 and refresh
 3) Swipe back to fragment 1
 4) Refresh fragment 1
 
 Result:
 
 Fragment 1 cannot refresh layout

 Sample:
 
 ![sample](https://github.com/jinkg/dispatchWindowInsets_bug_sample/blob/master/screen_shots/dispatch_window_insets_bug_sample.gif)
