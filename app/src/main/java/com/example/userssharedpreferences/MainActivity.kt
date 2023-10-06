package com.example.userssharedpreferences

import android.content.Context
import android.os.BatteryManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.userssharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), onClickListener {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val preferences = getPreferences(Context.MODE_PRIVATE)

        val isFirstTime = preferences.getBoolean(getString(R.string.sp_first_time), false)
        Log.i("Sp", "${getString(R.string.sp_first_time)} = $isFirstTime")

        userAdapter = UserAdapter(getUsers(), this)
        linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    private fun getUsers():MutableList<User> {
        val users = mutableListOf<User>()

        val Alain = User(1, "Jose", "Perez", "https://t2.uc.ltmcdn.com/es/posts/0/3/2/como_alejarse_de_una_persona_toxica_45230_orig.jpg")
        val Briant = User(2, "Briant", "Perez", "https://t2.uc.ltmcdn.com/es/posts/0/3/2/como_alejarse_de_una_persona_toxica_45230_orig.jpg")
        val Leandro = User(3, "Javier", "Perez", "https://t2.uc.ltmcdn.com/es/posts/0/3/2/como_alejarse_de_una_persona_toxica_45230_orig.jpg")
        val Alejandro = User(4, "Alejandro", "Perez", "https://t2.uc.ltmcdn.com/es/posts/0/3/2/como_alejarse_de_una_persona_toxica_45230_orig.jpg")
        val Luis= User(5, "Luis", "Perez", "https://t2.uc.ltmcdn.com/es/posts/0/3/2/como_alejarse_de_una_persona_toxica_45230_orig.jpg")

        users.add(Alain)
        users.add(Briant)
        users.add(Leandro)
        users.add(Alejandro)
        users.add(Luis)
        users.add(Alain)
        users.add(Briant)
        users.add(Leandro)
        users.add(Alejandro)
        users.add(Luis)
        users.add(Alain)
        users.add(Briant)
        users.add(Leandro)
        users.add(Alejandro)
        users.add(Luis)
        users.add(Alain)
        users.add(Briant)
        users.add(Leandro)
        users.add(Alejandro)
        users.add(Luis)
        users.add(Alain)
        users.add(Briant)
        users.add(Leandro)
        users.add(Alejandro)
        users.add(Luis)
        users.add(Alain)
        users.add(Briant)
        users.add(Leandro)
        users.add(Alejandro)
        users.add(Luis)
        users.add(Alain)
        users.add(Briant)
        users.add(Leandro)
        users.add(Alejandro)
        users.add(Luis)

        return users

    }

    override fun onClick(user: User, position: Int) {
        Toast.makeText(this, "$position: ${user.getFullName()}", Toast.LENGTH_SHORT).show()
    }
}