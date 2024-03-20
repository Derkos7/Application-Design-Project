package com.example.playarchive

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FF5733">
</RelativeLayout>

<ScrollView
android:layout_width="match_parent"
android:layout_height="match_parent">

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical">

    </LinearLayout>

</ScrollView>

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent">

<androidx.recyclerview.widget.RecyclerView
android:id="@+id/recycler_view_chat"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:layout_above="@+id/layout_send_message" />

<LinearLayout
android:id="@+id/layout_send_message"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_alignParentBottom="true"
android:orientation="horizontal">

<EditText
android:id="@+id/edit_text_message"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:layout_weight="1"
android:hint="Type your message here"/>

<Button
android:id="@+id/button_send"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Send"/>

</LinearLayout>

</RelativeLayout>
