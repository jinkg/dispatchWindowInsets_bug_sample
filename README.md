# dispatchWindowInsets_bug_sample


 DispatchWindowInsets bug sample
 
 Require:
 1.Set fitsSystemWindows=true in first page's list item
 @see layout_item1.xml
 2.Request layout before change status bar text color
 @see changeStatusBarText
 
 Step:
 1.Refresh list 1
 2.Swipe to list 2 and refresh
 3.Swipe back to list 1
 4.Refresh list 1
 
