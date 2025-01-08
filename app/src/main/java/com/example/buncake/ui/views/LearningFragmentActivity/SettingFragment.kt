package com.example.buncake.ui.views.LearningFragmentActivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.buncake.R
import com.example.buncake.ui.views.LearningFragmentActivity.About.AboutFragment
import com.example.buncake.ui.views.LearningFragmentActivity.Calendar.CalendarFragment
import com.example.buncake.ui.views.LearningFragmentActivity.MainSetting.MainSettingFragment


class SettingFragment : Fragment(), SettingItemAdapter.OnItemClickListener {
    private val calendarFragment = CalendarFragment()
    private val aboutFragment = AboutFragment()
    private val mainSettingFragment = MainSettingFragment()

    // List chứa các item
    private lateinit var settingItemList: MutableList<SettingItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        settingItemList = mutableListOf<SettingItem>(
            SettingItemImpl(
                leftIcon = R.drawable.calendar,
                title =  "Calendar",
                rightIcon = R.drawable.arrow_right,
                fragment = calendarFragment
            ),
            SettingItemImpl(
                leftIcon = R.drawable.about,
                title =  "About",
                rightIcon = R.drawable.arrow_right,
                fragment = aboutFragment
            ),
            SettingItemImpl(
                leftIcon = R.drawable.settings,
                title =  "Main Setting",
                rightIcon = R.drawable.arrow_right,
                fragment = mainSettingFragment
            )
        )



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout cho fragment
        val view = inflater.inflate(R.layout.fragment_setting, container, false)

        // Khởi tạo RecyclerView và thiết lập Adapter
        val recyclerView: RecyclerView = view.findViewById(R.id.settingRecyclerView)
        val adapter = SettingItemAdapter(
            settingItemList, this
        )
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter

        return view
    }

    // Xử lý khi người dùng click vào item
    override fun onItemClick(position: Int, item: SettingItem) {
        requireActivity().supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.rotate_in,  // Animation khi fragment mới vào (right -> left)
                R.anim.rotate_out,  // Animation khi fragment hiện tại ra (left -> right)
                R.anim.rotate_in,   // Animation khi fragment trở lại (left -> right)
                R.anim.rotate_out  // Animation khi fragment hiện tại ra (right -> left)
            )
            .replace(R.id.learning_fragment_container, item.fragment)
            .addToBackStack(null)
            .commit()
    }


    
}