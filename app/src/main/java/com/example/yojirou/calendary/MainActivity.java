package com.example.yojirou.calendary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    class Sample120{
        public void main(String args[]){
            //日付を格納する変数を作成

            Calendar now = Calendar.getInstance();

            //日付の取得

            System.out.println("現在の時刻は " + now.get(now.DATE) + " です");

            //日付を出力


        }

    }
    public void changeLabel(View view){
        TextView tv = (TextView)findViewById(R.id.myTextView);

        Calendar now = Calendar.getInstance();

        if(now.get(now.DATE) == 1) {
            tv.setText("常識をぶちこわせ！");
        }
        else if (now.get(now.DATE) == 2){
            tv.setText("僕はナンバーワンになりたい！");
        }

        else if (now.get(now.DATE) == 3){
            tv.setText("ハングリーになれ！　愚か者になれ！");
        }
        else if (now.get(now.DATE) == 4){
            tv.setText("月曜日までまて？冗談だろう？今夜中だ！");
        }
        else if (now.get(now.DATE) == 5){
            tv.setText("心の底から「やるんだ」と思え！");
        }
        else if (now.get(now.DATE) == 6){
            tv.setText("ベストを尽くして失敗したら、ベストを尽くしたってことさ");
        }
        else if (now.get(now.DATE) == 7){
            tv.setText("さあ、次はどんな夢を描こうか？");
        }
        else if (now.get(now.DATE) == 8){
            tv.setText("あわてるな！　夢中になれることは必ず見つかる");
        }
        else if (now.get(now.DATE) == 9){
            tv.setText("僕にライバルはいない");
        }
        else if (now.get(now.DATE) == 10){
            tv.setText("自分の心に素直になれ");
        }
        else if (now.get(now.DATE) == 11){
            tv.setText("やりたいことは本当にこんなことか？");
        }
        else if (now.get(now.DATE) == 12){
            tv.setText("「安全」はいちばん危険な落とし穴だ");
        }
        else if (now.get(now.DATE) == 13){
            tv.setText("自分の居場所は自分で作れ");
        }
        else if (now.get(now.DATE) == 14){
            tv.setText("積み上げたものを自分で打ち砕く勇気を持て！");
        }
        else if (now.get(now.DATE) == 15){
            tv.setText("終着点は重要じゃない。旅の途中を大いにたのしめ！");
        }
        else if (now.get(now.DATE) == 16){
            tv.setText("今日が人生最後の日なら、最高の１日ですごせるか");
        }
        else if (now.get(now.DATE) == 17){
            tv.setText("誰かのために時間をムダにするな！");
        }
        else if (now.get(now.DATE) == 18){
            tv.setText("愛すべき何かを見つけなさい");
        }
        else if (now.get(now.DATE) == 19){
            tv.setText("自信はどうしたんだ？これは君の芸術だぞ");
        }
        else if (now.get(now.DATE) == 20){
            tv.setText("前に進みたいなら何かを捨てろ！");
        }
        else if (now.get(now.DATE) == 21){
            tv.setText("ピンチの時ほどものごとがよく見えるんだ");
        }
        else if (now.get(now.DATE) == 22){
            tv.setText("我慢さえできれば、うまくいったも同然だ");
        }
        else if (now.get(now.DATE) == 23){
            tv.setText("人生はこれからも続く。続けなきゃいけないんだ！");
        }
        else if (now.get(now.DATE) == 24){
            tv.setText("あなたと僕は未来をつくるんです！");
        }
        else if (now.get(now.DATE) == 25){
            tv.setText("自分をすごい奴だと思うか？");
        }
        else if (now.get(now.DATE) == 26){
            tv.setText("進む方向を間違えると多くの壁にぶつかるぞ");
        }
        else if (now.get(now.DATE) == 27){
            tv.setText("点と点は、いつか必ず結びつくんだ！");
        }
        else if (now.get(now.DATE) == 28){
            tv.setText("失敗を覚悟で挑み続けるのがアーティストだ！");
        }
        else if (now.get(now.DATE) == 29){
            tv.setText("その一瞬の判断が未来を棒に振るかもしれないぞ");
        }
        else if (now.get(now.DATE) == 30){
            tv.setText("「死」は生命にとって最もすばらしい発明品だ");
        }
        else{
            tv.setText("昔を振り返るのはこれで終わり。大切なのはここからだ");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
