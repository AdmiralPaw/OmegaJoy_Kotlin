package com.example.omegajoy.ui.robotmanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.Navigation
import com.example.omegajoy.MainActivity
import com.example.omegajoy.R
import com.example.omegajoy.ui.FullFrameFragment

/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class RobotManagerFragment : FullFrameFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_robot_manager, container, false)

        val button_to_home: ImageButton = root.findViewById(R.id.button_to_home)
        button_to_home.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_robot_manager_to_nav_home)
        )
        val button_to_menu: ImageButton = root.findViewById(R.id.button_to_menu)
        button_to_menu.setOnClickListener {
            (activity as MainActivity).openDrawer()
        }
        val buttonAdd: Button = root.findViewById(R.id.button_add_device)
        buttonAdd.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_robot_manager_to_nav_add_robot)
        )

        return root
    }
}