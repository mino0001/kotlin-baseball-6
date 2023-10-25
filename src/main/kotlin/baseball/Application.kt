package baseball

import camp.nextstep.edu.missionutils.Randoms

fun main() {

    var flag = 1

    println("숫자 야구 게임을 시작합니다.")

    while ( flag == 1 ) {
        performBaseballGame(flag)
    }
}


fun performBaseballGame(flag : Int): Int {

    val computer = mutableListOf<Int>()
    createRandomNum(computer)


    return flag
}

fun createRandomNum(computer :  MutableList<Int>) {
    while (computer.size < 3) {
        val randomNumber = Randoms.pickNumberInRange(1, 9)
        if (!computer.contains(randomNumber)) {
            computer.add(randomNumber)
        }
    }
}