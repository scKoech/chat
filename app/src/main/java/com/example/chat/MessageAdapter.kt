package com.example.chat

import android.content.Context
import android.provider.Telephony.Mms.Sent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class MessageAdapter(val context:Context,val messageList:ArrayList<Message>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val ITEM_RECEIVE =1
    val ITEM_SENT =2


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {


    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentMessage=messageList[position]
        if(holder.javaClass==SentViewHolder::class.java){

            val viewHolder=holder as SentViewHolder
            holder.sentMessage.text=currentMessage.message


        }else{
            val viewHolder=holder as ReceiveViewHolder
            holder.receiveMessage.text=currentMessage.message

        }
    }

    class SentViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val sentMessage=itemView.findViewById<TextView>(R.id.txt_sent_message)

    }
    class ReceiveViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val receiveMessage=itemView.findViewById<TextView>(R.id.txt_receive_message)
    }
}