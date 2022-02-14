package com.example.androidtelegram.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtelegram.R
import com.example.androidtelegram.adapter.ChatAdapter
import com.example.androidtelegram.model.Chat

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats():ArrayList<Chat>{
        val chats: ArrayList<Chat> = ArrayList<Chat>()
        chats.add(Chat(R.drawable.im_user_1,"Xurshidbek Kurbanov","Yes you are good at programming"))
        chats.add(Chat(R.drawable.im_user_2,"Begzodbek Kurbanov","What was the question?"))
        chats.add(Chat(R.drawable.im_user_3,"Sherzodbek Kurbanov","Shall we start our lesson?"))
        chats.add(Chat(R.drawable.im_user_1,"Xurshidbek Kurbanov","Yes you are good at programming"))
        chats.add(Chat(R.drawable.im_user_2,"Begzodbek Kurbanov","What was the question?"))
        chats.add(Chat(R.drawable.im_user_3,"Sherzodbek Kurbanov","Shall we start our lesson?"))
        chats.add(Chat(R.drawable.im_user_1,"Xurshidbek Kurbanov","Yes you are good at programming"))
        chats.add(Chat(R.drawable.im_user_2,"Begzodbek Kurbanov","What was the question?"))
        chats.add(Chat(R.drawable.im_user_3,"Sherzodbek Kurbanov","Shall we start our lesson?"))
        chats.add(Chat(R.drawable.im_user_1,"Xurshidbek Kurbanov","Yes you are good at programming"))
        chats.add(Chat(R.drawable.im_user_2,"Begzodbek Kurbanov","What was the question?"))
        chats.add(Chat(R.drawable.im_user_3,"Sherzodbek Kurbanov","Shall we start our lesson?"))
        return chats
    }
}