package kz.iitu.busnetmobile.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.iitu.busnetmobile.R

@Composable
fun SignUpScreenComponent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SignUnUpperSide()
        InputFields()
        SignUpLowerSide()
    }


}

@Composable
fun SignUpLowerSide() {
    val checked = remember { mutableStateOf(false) }
    Column() {

        Row(
            modifier = Modifier
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checked.value,
                onCheckedChange = { newChecked -> checked.value = newChecked }
            )
            Text("I accept the terms and conditions")
        }
        Button(
            onClick = {

            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFFB7126))

        ) {
            Text(
                text = stringResource(id = R.string.signup),
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 80.dp, vertical = 5.dp),
            )
        }
    }


}

@Composable
fun SignUnUpperSide() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(bottom = 30.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.busnet_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .size(120.dp)
                .padding(10.dp)
        )
        Text(
            text = "Nice to see you!",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(5.dp)
        )
        Text(
            text = "Create your account",
            fontSize = 14.sp,
            color = Color(0xFF9095A1),
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center
        )


    }
}

@Composable
fun InputFields() {
    Column {
        UserNameInput()
        EmailInput()
        PasswordInput()
    }

}

@Composable
fun PasswordInput() {
    var password by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        modifier = Modifier
            .padding(vertical = 5.dp),
        placeholder = { Text(text = "Enter password") },
    )
}

@Composable
fun EmailInput() {
    var email by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = email,
        onValueChange = { email = it },
        modifier = Modifier
            .padding(vertical = 5.dp),
        placeholder = { Text(text = "Enter email") },
    )
}

@Composable
fun UserNameInput() {
    var username by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = username,
        onValueChange = { username = it },
        label = { Text("Enter username") },
        modifier = Modifier
            .padding(vertical = 5.dp),
        placeholder = { Text(text = "Enter username") },
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true

)
@Composable
fun SignUpScreenPreview() {
    SignUpScreenComponent()

}