package com.johenin.johen_burgerking_jpcompose

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.FloatingActionButtonDefaults.elevation
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.containerColor
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.johenin.johen_burgerking_jpcompose.ui.theme.Johen_burgerking_jpComposeTheme
import java.text.DecimalFormat

class MembershipActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Johen_burgerking_jpComposeTheme {
                MembershipScreen()
            }
        }
    }
}

@Preview(showBackground = true,
    widthDp = 480,
    heightDp = 1067)
@Composable
fun MembershipScreenPreview() {
    Johen_burgerking_jpComposeTheme {
        MembershipScreen()
    }
}

@Composable
fun MembershipScreen() {
    Scaffold(
        topBar = {
            TopNavigationBar("멤버십", tintColorId = R.color.burgerkingBackground)
        }) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(colorResource(R.color.burgerkingBackground))
                .verticalScroll(rememberScrollState())
        ) {
            UserProfileBarcode("인준현", "JUNIOR", "Jr", 1000, "WELCOME")
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(R.color.burgerkingBackground))
            ) {
                Text(
                    "멤버십 쿠폰",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.burgerkingText),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFF007700)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                        .height(100.dp)

                ) { Text("10000원이상구매시 1,000원할인 쿠폰") }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    modifier = Modifier
                        .fillMaxHeight()
                ) {
                    Text(
                        "더 많은 쿠폰 보기",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = colorResource(id = R.color.burgerkingText),
                        textDecoration = TextDecoration.Underline
                    )
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(R.color.burgerkingBackground))
            ) {
                Text(
                    "멤버십 등급별 혜택",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.burgerkingText)
                )
                MembershipTabScreen()

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(R.color.burgerkingBackground))
            ) {
                MenuDivider()

                ExpandableCard("멤버십 적립 및 등급 관련 안내")
                ExpandableCard("멤버십 쿠폰 관련 안내")
                ExpandableCard("멤버십 적립 제외 매장")

            }

        }
    }
}

@Composable
fun UserProfileBarcode(name: String, rank: String, rankAbv: String, point: Int, nextRank: String) {
    Column(
        modifier = Modifier
            .padding(15.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(15.dp))
                .background(Color.White)
                .padding(15.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .background(color = Color(0xFF007700))
                            .size(50.dp)
                    ) {
                        Text(
                            rankAbv,
                            Modifier.padding(10.dp),
                            color = Color.White,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 20.sp
                        )
                    }
                    Text(
                        "${name}님",
                        color = colorResource(id = R.color.burgerkingText),
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .padding(start = 8.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        rank,
                        color = colorResource(id = R.color.burgerkingText),
                        fontWeight = FontWeight.ExtraBold,
                    )

                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "실적기간 2024-10-01 ~ 2024-12-31",
                        color = colorResource(id = R.color.burgerkingText),
                        textAlign = TextAlign.Center,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(lineHeight = 1.2.em)
                    )
                    Text(
                        "결제금액 반영은 최대 48시간 소요될 수 있습니다.",
                        color = Color.Gray,
                        textAlign = TextAlign.Center,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Light,
                        style = TextStyle(lineHeight = 1.2.em)
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    LinearProgressIndicator(
                        progress = { 0.8f },
                        color = colorResource(id = R.color.burgerkingOrange),

                        modifier = Modifier
                            .weight(1f)
                            .height(7.dp)
                    )
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .background(color = Color(0xFF007700))
                            .size(50.dp)
                    ) {
                        Text(
                            rankAbv,
                            Modifier.padding(10.dp),
                            color = Color.White,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 20.sp
                        )
                    }
                }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {//${DecimalFormat("#,###").format(orderPrice)}원
                    Text(
                        "${
                            DecimalFormat("#,###").format(point)
                        }원 추가 구매시 JUNIOR\n다음달 예상 등급 $nextRank",
                        color = colorResource(id = R.color.burgerkingText),
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(lineHeight = 1.2.em)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.barcodeimage),
                        contentDescription = "home icon",
                    )
                }
            }
        }
    }
}

@Composable
fun ExpandableCard(title: String) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        colors = CardDefaults.cardColors(Color.Transparent),
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                onClick = { expanded = !expanded },
                indication = null,
                interactionSource = remember { androidx.compose.foundation.interaction.MutableInteractionSource() })
    )
    {
        Column(
        ) {
            if (expanded) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 22.dp, vertical = 10.dp),
                ) {
                    Text(
                        text = title, color = colorResource(id = R.color.burgerkingText),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Icon(
                        painterResource(R.drawable.back),
                        contentDescription = "home icon",
                        tint = colorResource(id = R.color.burgerkingText),
                        modifier = Modifier
                            .graphicsLayer(scaleX = -1f)
                            .size(15.dp)
                            .rotate(90f)
                    )
                }
                Text(
                    text = "Content Sample for Display on Expansion of Card",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(8.dp),
                )
            } else {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 22.dp, vertical = 10.dp),
                ) {
                    Text(
                        text = title, color = colorResource(id = R.color.burgerkingText),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Icon(
                        painterResource(R.drawable.back),
                        contentDescription = "home icon",
                        tint = colorResource(id = R.color.burgerkingText),
                        modifier = Modifier
                            .graphicsLayer(scaleX = -1f)
                            .size(15.dp)
                            .rotate(-90f)
                    )
                }
            }
            MenuDivider()
        }
    }
}

@Composable
fun MembershipTabScreen() {
    var tabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("WELCOME", "JUNIOR", "WHOPPER", "KING")
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .clip(RoundedCornerShape(15.dp))
    ) {
        TabRow(
            selectedTabIndex = tabIndex,
            containerColor = Color(0xFFe9dccb),
            contentColor = colorResource(R.color.burgerkingText),
            indicator = { tabPositions ->
                SecondaryIndicator(
                    modifier = Modifier.tabIndicatorOffset(tabPositions[tabIndex]),
                    color = Color.Transparent
                )
            },
            divider = {Color.Transparent},
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = tabIndex == index,
                    onClick = { tabIndex = index },
                    modifier = Modifier
                        .padding(top = 5.dp, start = 5.dp, end = 5.dp)
                        .clip(
                            if (tabIndex == index) RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)
                        else RoundedCornerShape(0.dp))
                        .background(if (tabIndex == index) Color.White else Color(0xFFe9dccb)),
                    text = {
                        Text(
                            title,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 12.sp,
                            color = if (tabIndex == index) colorResource(R.color.burgerkingText) else Color(0xFF997e6d),
                            textDecoration = if (tabIndex == index) TextDecoration.Underline else TextDecoration.None
                        )
                    },


                )
            }
        }
        when (tabIndex) {
            0 -> WelcomeMembership()
            1 -> JuniorMembership()
            2 -> WhopperMembership()
            3 -> KingMembership()
        }
    }
}

@Composable
fun WelcomeMembership() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column() {
            Row() {
                Text("W")
                Text("WELCOME\n웰컴")
                Text("가입회원")
            }
            Text("회원전용 채널 쿠폰")
            Text("생일 쿠폰")
        }
    }
}

@Composable
fun JuniorMembership() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
    ) {
        Column() {
            Row() {
                Text("Jr")
                Text("JUNIOR\n주니어")
                Text("최근 3개월 누적\n1만원 이상 구매")
            }
            Text("주니어등급 전용 채널 쿠폰")
            Text("승급 축하 와퍼주니어 무료 쿠폰")
            Text("$1천원 할인 쿠폰")
            Text("생일 쿠폰")
        }
    }
}

@Composable
fun WhopperMembership() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
    ) {
        Column() {
            Row() {
                Text("W")
                Text("WHOPPER\n와퍼")
                Text("최근 3개월 누적\n3만원 이상 구매")
            }
            Text("와퍼, 주니어 전용 채널 쿠폰")
            Text("승급 축하 와퍼 단품 무료 쿠폰")
            Text("아메리카노 무료 쿠폰 1매")
            Text("2천원 할인 쿠폰")
            Text("생일 쿠폰")
        }
    }
}

@Composable
fun KingMembership() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
    ) {
        Column() {
            Row() {
                Text("K")
                Text("KING\n킹")
                Text("최근 3개월 누적\n5만원 이상 구매")
            }
            Text("킹, 와퍼, 주니어 전용 채널 쿠폰")
            Text("승급 축하 와퍼 세트 무료 쿠폰")
            Text("아메리카노 무료 쿠폰 3매")
            Text("3천원 할인 쿠폰")
            Text("생일 쿠폰")
        }
    }
}