package com.example.healthypuppy

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun HealthyPuppyApp (
    navController:NavHostController = rememberNavController()
) {
    Scaffold (
        topBar = {
            HealthyAppBar(
                canNavigateBack = false,
                navigateUp = {navController.navigateUp() }
            )
        }
    ){innerPadding ->
        NavHost(
            navController = navController,
            startDestination = HealthyPuppyScreen.LoginScreen.name,
            modifier = Modifier.padding(innerPadding)
        ){
            composable(route = HealthyPuppyScreen.LoginScreen.name){
                LoginScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HealthyAppBar(
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
){
    TopAppBar(
        title = {
            Text(stringResource(R.string.app_name))
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF70b578)
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowLeft,
                        contentDescription = ""
                    )
                }

            }
        },
    )
}