package axiomtask.number2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnNext: Button = findViewById(R.id.btnNextId)
        var btnPrev: Button = findViewById(R.id.btnPrevId)
        var textViewUserNo:TextView =  findViewById(R.id.tvUserNoId)
        var textViewUserName:TextView = findViewById(R.id.tvUserNameId)
        var textViewUserEmail:TextView = findViewById(R.id.tvUserEmailId)
        var textViewUserAge:TextView = findViewById(R.id.tvUserAgeId)
        var userList:ArrayList<User> = ArrayList()


        var user1:User = User("Name1","Email1","Age1")
        var user2:User = User("Name2","Email2","Age2")
        var user3:User = User("Name3","Email3","Age3")
        var user4:User = User("Name4","Email4","Age4")
        var user5:User = User("Name5","Email5","Age5")
        var user6:User = User("Name6","Email6","Age6")

        userList.add(user1)
        userList.add(user2)
        userList.add(user3)
        userList.add(user4)
        userList.add(user5)
        userList.add(user6)
        var count:Int =  0

        textViewUserNo.setText(""+count)
        textViewUserName.setText(user1.name)
        textViewUserEmail.setText(user1.email)
        textViewUserAge.setText(user1.age)

        btnNext.setOnClickListener(){
            if(count+1 >=  userList.size) {
                Toast.makeText(applicationContext,"There are no more users than $count",Toast.LENGTH_SHORT).show()
            }
            else{
                count++
                textViewUserNo.setText(""+count)
                textViewUserName.setText(userList.get(count).name)
                textViewUserEmail.setText(userList.get(count).email)
                textViewUserAge.setText(userList.get(count).age)
            }
        }

        btnPrev.setOnClickListener({
            if(count-1 <  0) {
                Toast.makeText(applicationContext,"There are no more users than $count",Toast.LENGTH_SHORT).show()
            }
            else{
                count--
                textViewUserNo.setText(""+count)
                textViewUserName.setText(userList.get(count).name)
                textViewUserEmail.setText(userList.get(count).email)
                textViewUserAge.setText(userList.get(count).age)
            }
        })
    }
}
