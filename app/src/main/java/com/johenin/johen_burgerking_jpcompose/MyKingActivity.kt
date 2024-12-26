package com.johenin.johen_burgerking_jpcompose

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.johenin.johen_burgerking_jpcompose.ui.theme.Johen_burgerking_jpComposeTheme
import java.text.DecimalFormat

class MyKingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Johen_burgerking_jpComposeTheme {
                MyKingScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Johen_burgerking_jpComposeTheme {
        MyKingScreen()
    }
}

@Composable
fun MyKingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.burgerkingBackground))

    ) {
        TopNavigationBar("MY킹", tintColorId = R.color.burgerkingRed)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            UserProfile("인준현", "JUNIOR", "Jr", 1000, "WELCOME")
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                MenuDivider()
                UserButtonItem("멤버십", MembershipActivity())
                UserButtonItem("주문내역", OrderHistoryActivity())
                UserButtonItem("정보변경", EditProfileActivity())
                UserButtonItem("MY배달지", AddressActivity())
                UserButtonItem("딜리버리 카트", DeliveryCartActivity())
                UserButtonItem("킹오더 카트", KingOrderActivity())
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
            ) {
                Text(
                    "최근 주문내역",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.burgerkingText),
                    modifier = Modifier
                        .padding(top = 30.dp)
                )
                HorizontalDivider(
                    thickness = 1.5.dp,
                    color = colorResource(id = R.color.burgerkingText),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .padding(vertical = 15.dp)
                )
//                OrderHistory(
//                    "2024.11.16 PM 16:16",
//                    "트러플 머쉬룸 와퍼 세트외 3건",
//                    "986730278",
//                    "용산이마트점",
//                    "9,000"
//                )
//                OrderHistory(
//                    "2024.09.16 AM 11:16",
//                    "와퍼 세트+21치즈스틱외 4건",
//                    "981195658",
//                    "군자능동점",
//                    "7,500"
//                )
//                OrderHistory(
//                    "2024.04.18 PM 17:24",
//                    "와퍼외 3건",
//                    "967502100",
//                    "청담점",
//                    "11,300"
//                )
//                OrderHistory(
//                    "2024,01,27 PM 14:29",
//                    "치즈버거세트외 3건",
//                    "960956417",
//                    "종로점",
//                    "5,500"
//                )
                for (item in NewOrderHistory.entries) {
                    OrderHistory(
                        item.orderTime,
                        item.orderMenu,
                        item.orderNumber,
                        item.orderStore,
                        item.orderPrice
                    )
                }
            }
        }
        BottomNavigationBar()
    }
}

@Composable
fun TopNavigationBar(pageId: String, tintColorId: Int = R.color.burgerkingText) {
    val contextCurrent = LocalContext.current
    val contextBefore = LocalContext.current as? Activity
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(colorResource(R.color.burgerkingBackground))
            .fillMaxWidth()
            .padding(vertical = 10.dp)

    ) {
        Button(
            onClick = { contextBefore?.finish() },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
        ) {
            Icon(
                painterResource(R.drawable.back),
                contentDescription = "back",
                tint = colorResource(id = R.color.burgerkingText),
                modifier = Modifier
                    .size(25.dp)
            )
        }
        Text(
            pageId,
            color = colorResource(id = R.color.burgerkingText),
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Button(
            onClick = {
                val intent = Intent(contextCurrent, BarcodeActivity::class.java)
                contextCurrent.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
        ) {
            Icon(
                painterResource(R.drawable.barcode),
                contentDescription = "menu icon",
                tint = colorResource(id = tintColorId),
                modifier = Modifier
                    .size(40.dp)
            )
        }
    }
}

@Composable
fun UserProfile(name: String, rank: String, rankAbv: String, point: Int, nextRank: String) {
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

                }
            }
        }

    }
}

@Composable
fun UserButtonItem(buttonName: String, linkActivity: ComponentActivity = MembershipActivity()) {
    val context = LocalContext.current
    Column() {
        Button(
            onClick = {
                val intent = Intent(context, linkActivity::class.java)
                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    buttonName, color = colorResource(id = R.color.burgerkingText),
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
                )
            }
        }
        MenuDivider()
    }
}

@Composable
fun OrderHistory(
    orderTime: String,
    orderMenu: String,
    orderNumber: String,
    orderStore: String,
    orderPrice: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
            .padding(vertical = 8.dp), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column() {
            Row() {
                Text(
                    "매장", fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.burgerkingOrange)
                )
                Text(
                    orderTime, fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.burgerkingText)
                )
            }
            Text(
                orderMenu, fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.burgerkingText)
            )
            Row() {
                Text(
                    "주문번호", fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.burgerkingText)
                )
                Text(
                    orderNumber.toString(), fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.burgerkingText)
                )
                Text(
                    orderStore, fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.burgerkingText)
                )
            }
        }
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "주문완료",
                color = Color.White,
                modifier = Modifier.background(colorResource(id = R.color.burgerkingRed)),
            )
            Text(
                "결제금액 ${DecimalFormat("#,###").format(orderPrice)}원",
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.burgerkingText)
            )
        }
    }
}

enum class NewOrderHistory(
    val orderTime: String,
    val orderMenu: String,
    val orderNumber: String,
    val orderStore: String,
    val orderPrice: Int
) {
    no986730278("2024.11.16 PM 16:16", "트러플 머쉬룸 와퍼 세트외 3건", "986730278", "용산이마트점", 9000),
    no981195658("2024.09.16 PM 11:16", "와퍼 세트+21치즈스틱외 4건", "981195658", "군자능동점", 7500),
    no967502100("2024.04.18 PM 17:24", "와퍼외 3건", "967502100", "청담점", 11300),
    no960956417("2024,01,27 PM 14:29", "치즈버거세트외 3건", "960956417", "종로점", 5000)
}

@Composable
fun BottomNavigationBar() {
    var selectedItem: Int by remember { mutableIntStateOf(0) }
    val items = listOf("홈", "쿠폰", "주문", "MY킹", "더보기")
    val selectedIcons = listOf(
        painterResource(R.drawable.home),
        painterResource(R.drawable.coupon),
        painterResource(R.drawable.order),
        painterResource(R.drawable.myking),
        painterResource(R.drawable.more)
    )
    val unselectedIcons =
        listOf(
            painterResource(R.drawable.home),
            painterResource(R.drawable.coupon),
            painterResource(R.drawable.order),
            painterResource(R.drawable.myking),
            painterResource(R.drawable.more)
        )
    NavigationBar(
        containerColor = colorResource(id = R.color.burgerkingBackground),
        contentColor = colorResource(id = R.color.burgerkingText),

        ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = if (selectedItem == index) selectedIcons[index] else unselectedIcons[index],
                        contentDescription = item,
                        tint = if (selectedItem == index) {
                            colorResource(id = R.color.burgerkingRed) // Tint for selected item
                        } else {
                            colorResource(id = R.color.burgerkingText) // Tint for unselected items
                        }
                    )
                },
                label = {
                    Text(
                        item,
                        color = if (selectedItem == index) {
                            colorResource(id = R.color.burgerkingRed) // Tint for selected item
                        } else {
                            colorResource(id = R.color.burgerkingText) // Tint for unselected items
                        },
                        fontWeight = FontWeight.SemiBold
                    )
                },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.Transparent,

                    )
            )
        }
    }
}

@Composable
fun MenuDivider() {
    HorizontalDivider(
        thickness = 0.2.dp,
        color = colorResource(id = R.color.burgerkingText),
        modifier = Modifier
            .padding(horizontal = 15.dp)
    )
}