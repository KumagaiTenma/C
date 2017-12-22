package com.example.tenma.walkapp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by yuuma on 2017/12/19.
 */

public class Scenario extends AppCompatActivity {
    String result_str = "";
    static int number;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ディレクトリの文字列作成
        String dbStr = "data/data/" + getPackageName() + "/Sample.db";
        // 実際にDB作成
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(dbStr,  null );

        //テーブル作成用のクエリ文
        String query_table1 = "DROP TABLE IF EXISTS menber";
        String query_table2 = "CREATE TABLE menber" + " ( id INTEGER PRIMARY KEY , name  STRING ) ";

        //テーブルの作成
        db.execSQL(query_table1);
        db.execSQL(query_table2);

        //レコード作成用のクエリ文(INSERT)
        String query_record_set[]   =   {
                "INSERT INTO menber( name ) VALUES ( '魔王「あれ？おかしくね？勇者こなくね？500年くらいたったよね？え？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「魔王様。一つよろしいでしょうか？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「うむ。許そう。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「太りました？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「は？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「って三丁目の魔王が言ってましたよ。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「いやいや三丁目の魔王って誰やねん！おかしいやろ！てか魔王他にもいるんかい！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「まぁ大魔王様がお亡くなりになられてから500年が経ちましたもんね」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「500年たったんだよな？勇者って知ってる？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「あの歴代最強とうたわれている勇者ですよね？名前はアースだったかなぁ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「最近の勇者って500年生きるの？こなさすぎじゃね？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「確かに・・・いわれてみれば・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「探しに行ってみるわ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「ダイエットにもなりますしね！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんか言ったか？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「いえ・・・なにも・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'これから魔王の大きくて小さな旅が始まる' ) ",
                "INSERT INTO menber( name ) VALUES ( 'ザクソソの村・・・魔王「なんかさびれた村についたな。勇者はいるのだろうか」' ) ",
                "INSERT INTO menber( name ) VALUES ( '村人A「あんた、みねぇ顔だなぁ。なーんか魔物にしては人間みたいなからだしてるし」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「皆大好き魔王様です。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '村人A「そうかい。遠いところからわざわざこんな村に何しに来たんだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「え？わし魔王ぞ？普通恐れおののくよね？どういう肝してんだあんた」' ) ",
                "INSERT INTO menber( name ) VALUES ( '村人B「魔王ってまだいたんか？ボソ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「おい聞こえてんぞそこの腐った死体みたいなやつ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '村人C「いや腐ってはないぞ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「死体を否定しろよ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '村長「おや？あなたは魔王様？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「やっと話が通じそうなやつだな」' ) ",
                "INSERT INTO menber( name ) VALUES ( '村長「ここでくたばれ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「は？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「はぁはぁ・・・なんだこの爺達・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '村長「いやぁ・・・大変失礼しました。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ほんとだよ・・・四回くらい死にかけたぞ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '村長「お詫びと言っちゃなんですが宴を用意いたしました。今日は元々祭りだったものですから。魔王様もお楽しみください」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんかよくわからんが楽しむとしよう」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～36時間後～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「これいつまで続くんだ・・・そろそろ次の所に行こう・・・しっかし食いすぎたなぁ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'ジュドの洞窟・・・魔王「たしかこの洞窟にパーティが入り込んでいったと聞いたがもしや・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '男A「あんたもしかして魔王か？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「そうだ。私が」' ) ",
                "INSERT INTO menber( name ) VALUES ( '男B「くたばれやぁぁぁぁぁあ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「えぇぇぇぇぇぇぇぇぇぇぇぇええええ！なんでこうなるんや！！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～		' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あんたらなんなんだ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '男A「俺の名はシュガー。SDとでも呼んでくれ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なぜSDなんだ・・・まぁ良い。貴様らはなぜここにいるのだ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'SD「ここにはジュドの神が残したといわれるタカラがあると聞いたんだが一足二足三足四足くらい遅かったようだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「さすがに遅すぎじゃねぇか？まぁ我には関係ないんだけどさ。」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'SD「噂によるとアースとかいう奴が宝を持って行ったらしい」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「アース！？そいつは今どこに！？」	' ) ",
                "INSERT INTO menber( name ) VALUES ( 'SD「そいつは知らねぇな。まぁ情報によると生涯独り身を誓って旅をしているらしい」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「そうか。気長に探してみるとするか」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'SD「魔王のあんちゃん。俺たちとBBQしねぇか？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「え？話の流れがよくわからんのだが・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'SD「あくしろよ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「こっわ・・・ここは従うことにするか・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～3分後～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんだこいつら・・・酒に酔って寝たぞ・・・ま、抜け出すなら今の内か。」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'SD「重度ってなんやねん・・・ｚｚｚ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「？？？」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'ノアニーノレ村・・・魔王「ふう。ここは漁村か？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「あなた・・・魔王ね！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「そうです。私が変な魔王・・・ってだれが変な魔王やねん！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「なんだかノリがいい人なのね」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「まぁそんなことはどうでもよいのだが。一つ訪ねたいことがある」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「じゃあ条件があるわ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんじゃ言ってみるがよい？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「買い物に行ってきてほしいのだけれども・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ほう？この魔王に買い物をさせるか！娘！お主も肝が据わっておるの」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「彼氏とこれからデートなのよね～」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんだリア充かよ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「なんか魔王ってもてなさそうだよね！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「は？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「魔王って強くてかっこいいのね！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「彼氏可哀そう・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「これからデートに行きましょう！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「それはアリ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～98時間後～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「デート長すぎじゃないか・・・あの娘トイレに行ったが今の内に逃げよう・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'シエーノの町・・・魔王「ふと思ったんだが、我のキャラ軽くないか？画面の前のそなたはどう思う？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「たしかにね？最初のあらすじの所から薄々感じていたよ？なんかこの物語雰囲気軽いなって。正直ね普段こんなキャラじゃないんだよ。' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「きみはさ、正直魔王っぽくないなって思っとるんやろ？わかっとんねん。我もそう思う。' ) ",
                "INSERT INTO menber( name ) VALUES ( '俺もね本当はなりたくなかったんや。俺とか言っちゃてるけど気にしないでくれ。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「大魔王もさ、なんで俺のこと後継ぎにしたんやろか。俺以外の人の方が適任だと思うんだけどな。' ) ",
                "INSERT INTO menber( name ) VALUES ( '行く人に喧嘩吹っ掛けられるわ、娘にはモテないとか言われるわよくわかんない魔王から太ったとか言われるわ散々ですわ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「そんなこんなでシエーノって町についたんだが・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民「なげーわ！！！！！！！！！！！！！！！！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「今宵は一人酒でも楽しむか・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'マスター「お客さんお疲れのようだね」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「まぁね・・・マスターいつもの」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'マスター「あいよ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ふぅ・・・今日も疲れた」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'マスター「ミルクになります」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ありがとうマスター・・・ってなんでミルクやねん！ここバーだよね！！！いつものっていったらテキーラ当たり持って来いよ！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'マスター「お客さん・・・そいつは無理な注文ですね・・・なにせお客さん始めてじゃないですか」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'トッルカの町・・・魔王「ここは・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民A「あいつは！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民B「魔王！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「そうか・・・ここは昔我らが攻め込んだ町・・・恨まれても仕方がないか」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民A「息子の仇！！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「致し方ない・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「本当に申し訳ない・・・我も本当はやりたくないのだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民C「あんたはなぜこの町を壊滅に追い込んだ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ここにはルイーナの酒場があるだろう？勇者の仲間を増やしたくなくてな・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民A「それだけの理由だけでたくさんの人を殺したのか！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「本当に申し訳ない」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民B「あんたの顔は見たくはなかった」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「出ていくとしよう・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民C「まて。もう一つ聞きたいことがある」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民B「あんたはなぜこの町を滅ぼさなかった？あんたの力があればこんなちっぽけな街すぐ滅ぼすことができただろう？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「それは・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民A「俺は見ていたよ・・・魔物たちが皆を殺している時の悲しそうな顔を・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民C「あんたはいったい何がしたいんだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「貴様らに語る言葉はない。これからは幸せに暮らすといい」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民B「なぜそんなことを・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「我は貴様らから恨まれても仕方ないことをしてきた。たとえそれが我の本意じゃなくてもな。しかし正直こんなことはもう、したくはない。' ) ",
                "INSERT INTO menber( name ) VALUES ( '今後この町に限らず人間界を攻めることはない。我はこの時代の勇者に敗れることを望んでいる。そして我ら魔物が滅びることを望んでいる。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '町民ABC「・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「では俺は行くとしよう・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「という夢を見た」' ) ",
                "INSERT INTO menber( name ) VALUES ( '卍谷・・・魔王「ここはなんとも通常時のようなところだな」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'スキンヘッドの男「貴様イガ者か？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「どうみてもイガイガしてないんじゃが？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '目の開いていない男「こ奴からは邪気が感じられるが敵意はなさそうじゃ」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'スキンヘッド「イガ者ではないということか」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「おぬしら何の話をしておるんじゃ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '太っちょの男「おなごはおらぬか～」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「完全に場違いなのじゃが・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'スキンヘッド？「イガ者じゃ！であえであえ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「え？スキンヘッドが二人！？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '目の開いていない男「貴殿の手を貸してはくれぬか？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あ、はぁ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '針を加えている爺「助かった」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「いつの間にいたんや。てかあんた第一話で・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '爺「なんの話じゃ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '瞳術を使いそうな人「おぬし名を何という」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「魔王です・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '瞳術を使いそうな人「ほう。変わった名じゃな」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あんま気にしないでください」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'スキンヘッド「ケンノスケ様、この客人をもてなすのはいかがでしょう？」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'ケンノスケ「そう思っていたところじゃキョウブ、チャエモン、ピョウマ、オコウ！宴の準備じゃ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '一同「はッ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんか申し訳ないな」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'ケンノスケ「遠慮するな客人」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～1時間後～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「オコウ殿～良い体しておるな～」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'オコウ「兄様・・・助けてください・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'チャエモン「うぅむ・・根は悪い奴ではないのだがな・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「おや、つい楽しくて長居してしもうた。ではそろそろ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'ケンノスケ「うむ。今日は助かった。また訪ねてくるといい」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「そちらもお元気で。パジリスクタイム感謝する。」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'ケンノスケ「パジリスクタイムとは？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「こっちの話です。」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'チャイエンの森・・・魔王「なんだここは凄い煙だ・・・おや何か踏んだようだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「・・・返事がない。ただの屍のようだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「これが噂に聞くドラ〇ンクエ〇トクオリティか」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「これ毎回俺らが言ってるんだぜ？大変だよな・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「しゃべったー！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「屍が喋っちゃいけないんかワレェ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「い、いいえ・・・滅相もございません・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「つかあんた魔王やろ。こういう魔物も絶対いるやろ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「正直ゾンビ系の魔物達あんまり得意じゃないんだよね・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「俺らのこと馬鹿にしてるん？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「だってさー、話が通じてないっていうかぁ・・・。そういうの全部執事に任せてるんや」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「おどれはいいとしてもなぁ・・・んていうか魔王としての自覚あるんか？どないやろなぁ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「はぁ！うっせぇな！ただの負け犬！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「んだとてめぇ！ぶっ飛ばしてやる！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「お前らなかなかつえぇな！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「魔王もやっぱつえぇな！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「やめろよ///照れんだろ///」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「気持ちわる・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「・・・ホントこれだからゾンビ系は嫌なんだ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「つかあんたは何で死んだんだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「んー。まぁ俺は戦いに敗れたんだ。名誉ある戦いだったぜ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あんたさぞかし名のある将だったんだな・・・ちなみにどんな戦いだったんだ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「チャイエンリニューアルの乱だ。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「初めて聞いた闘いだな・・・どんな感じだったんだ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「ここには昔カジノがあったんだ。今は暴動によって潰れたからな」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「話が見えない・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「そのカジノはいつもいつも回収日でな。リニューアルでしかも6時からだったからな。今日こそはと思ったよ。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「まさか・・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「そう。あのカジノを信じた俺らがばかだったのさ・・・。俺はパチリスク～強敵～で・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「もういいよ・・・。それで負けたんだな。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「そうさ。そしておれは多額の借金を返せなくて死んでこうなった」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あほくさ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「なんか思い出したら悲しくなってきた。ラーメンでも食いに行こうぜ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「いいんだけどさ。お前ラーメン食っても骨じゃん。すぐ出て来るやろ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「まぁまぁ！じゃ行こうぜ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～3週間後～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「朝昼晩3食ラーメンはもう耐えれん！夜逃げじゃあぁぁぁあああ！！！！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '屍「マウンテンヘッドファイヤー行こうぜ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「うっせ！！！もうくたばれ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'プランカの城・・・魔王「ここは世界有数の脳筋大国のプランカか」' ) ",
                "INSERT INTO menber( name ) VALUES ( '門番「貴様！この大国になんの用か！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ちょっと勇者について聞きたくてな」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんか言ったか？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '門番「貴様の職業はなんだ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「旅人です」' ) ",
                "INSERT INTO menber( name ) VALUES ( '門番「よかろう。しかしこの国では少々問題が起こっておる。あまり騒ぎを大きくするでないぞ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「やっぱ脳筋だったか。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '門番「なんかいったか」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「いいえ。なにも」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～プランカに侵入～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「さっさと王に会いに行くか。ってあれ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「魔王はどこにいる！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「やっべ！ばれｒ・・・え？家壊してるんだけど・・怖い」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「貴様は魔王か！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あ、いえ。違います。ただの旅人です。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「ほうそうか。旅人よ何か用か？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「一つ訪ねたいことがありまして」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「うむ。申してみよ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「勇者アースについてなのですが」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「たしか、アースはアリアパンにいたはずだが・・・勇者に何か用か」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「魔王はいつになったら倒されるんだろうかと思いまして」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「確かに。盲点であったな。勇者がおるではないか！さては貴殿天才だな？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「お前は馬鹿かよ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「は？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「皆の衆。この旅人は我を愚弄した。この旅人を始末せよ！！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「は！こいつ筋金入りの脳筋かよ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「嘘じゃ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「は？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「今この国は嘘祭りというものをやっていてだな。よりリアルっぽい嘘をついた者が優勝なんじゃ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんつう祭り開いてんだこのおっさん」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「ちなみに勇者のくだりも嘘じゃ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ろくな死に方しねぇなこいつ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「ねぇそこのおじさまとお兄さん！私とお茶でもしない」' ) ",
                "INSERT INTO menber( name ) VALUES ( '二人「喜んで！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「おじさまはおくさまのことはよろしいのかしら？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「あんな可愛くない嫁などどうでもよいわ！早くお茶でも行こうではないか！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「は？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「え？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「おい。スケベ爺！くたばれやぁ！！！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「何を言ってるんだこの娘」' ) ",
                "INSERT INTO menber( name ) VALUES ( '娘「この姿を見てまだ気づかない？」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'べりっ' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「あー！！！お前は！！！！妻！！！！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「主人公は僕だよ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王の妻「ここで死んでいただきます！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王「おいそこの旅人！ワシを助けてくれ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「もうここでのイベントの尺が・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんだこの婆ども普通に今までの敵より強いんじゃが」' ) ",
                "INSERT INTO menber( name ) VALUES ( '王の妻「もう！失礼しちゃうわ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「王は結局ボコされてるし、この町に用はないな。まぁ、アリアパンを目指してみるか。」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'サザンクロス・・・魔王「一応ここを過ぎればアリアパンにつくはずだが」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「おじさんはだれ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「俺はおじさんじゃないぞ。お兄さんと呼べ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「お兄さん誰？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「俺様はな、魔王だ！どうだ怖いだろう！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「魔王って悪い人なの？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「魔王てのはー、怖いんだぞー！いっぱい悪さをするんだぞ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「どんなことするの？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「そうだなぁ。うーん。人間をいじめたりかな？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「じゃあまだ怖くないよ！この町のボスのほうが怖いよ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんだって！ちなみにそいつは何をしたんだ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「うーんとねぇ。ちょっと話が長くなるけどいい？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '▷いいえ' ) ",
                "INSERT INTO menber( name ) VALUES ( 'いいえ' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「じゃあいいや」' ) ",
                "INSERT INTO menber( name ) VALUES ( '神様「いや、聞けよ。ぶっ飛ばすぞ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「す、すみません・・・てか神様って？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「どうするの？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「聞かせてください何でもしますから」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「わかった！この町はね元々結構栄えていた町なんだぁ！でも急によくわからない悪い人たちが来て、この町にいた大人たちをほとんど殺しちゃったんだ！' ) ",
                "INSERT INTO menber( name ) VALUES ( '残った人たちはこのサザンクロスの地下にある所で奴隷として働かされてるらしいんだけどホントの事はわかんない！' ) ",
                "INSERT INTO menber( name ) VALUES ( 'いまここにいるのはその悪い人たちと殺されなかった年おいた人たち、子供だけ。しかも1週間に一度一人ずついけにえとして誰か捧げないと全員殺されちゃうんだー。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ほんとに長いな・・・。まぁいい。事情は分かった。しかし俺からしてやれることは何もない」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「別に何かしてもらおうとは思ってないよ！お兄さん魔王だしね」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「まぁな。しかし今の時代魔王を倒せみたいな風潮で人間たちは一致団結してるんじゃないのか？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「僕にはよくわかんない。でもお父さんは一番悪いのは魔王じゃない。人間の悪い心だっていっつも言ってた！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ほう。面白いこと言うお父さんだなぁ。んでお前さんは一人かい？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「そうだよー！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ほかの人たちは？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「ほとんどいないよ！今いるのは足が悪かったり、体が不自由でこの町から出られない人と、僕よりも小さい子と、僕ぐらいだね」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「そうか。そういえば生贄はどうするんだ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「今日、僕が行くよ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「他人のために死んでもいいのか？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「僕には元々友達がいなかったんだぁ。僕の家は貧しくて食事もろくにできやしないし、頭も悪いし、容量も悪い。仕事を探してもこんな子供は雇ってくれなかったしね。唯一の話相手のお母さんとお父さんも殺されちゃったし。でも僕は誰かの役に立ちたかった。お父さん達にはなにもしてあげれなかったし。だから最後はみんなを救いたいんだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「そうか。坊やは強いんだな。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「お兄さんのほうが強そうだよ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「見ればわかるだろ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「お兄さん面白い人だね！最後に会えてよかったよ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「じゃあもう僕行くね！バイバーイ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ちょっと待つんだ。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「俺もついていくよ。生贄にされるまでに転んで死んだらどうするんだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「そんなことしないよぉ～。でもありがとう！お兄さんは近くについたら離れててね？僕の死んだ姿を見ないようにね！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あ、あぁ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～1時間後～' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「さぁ、近くについたよ・・ってお兄さんどこ行くの！？その先は！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「小僧。なにも言うな。そして近くに来るな。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「え？で、でも・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「いいから。ここにいろ。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「う、うん・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '悪そうなモヒカン「なんだてめぇ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「貴様らに明日を生きる資格はねぇ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「坊や。帰ろう」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「でも生贄に・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「生贄はもういらない。これからは安心して暮らすといい。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「え？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ここであったことは秘密だぞ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「う、うん。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「じゃあな。」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「ねぇ！僕も連れてってよ！一人は嫌だよ・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「お前はここでみんなを守っていくんだ。そして平和な街を作るんだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「ぐす・・・うぅぅ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ほら泣くな。男の子が泣いちゃダメだろ？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「う、うん」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「今度こそさよならだ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '少年「バイバイお兄さん！いや、勇者さん！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「魔王だよ！じゃあな・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'いずれこの少年は世界を救うために世界を敵に回すのであった・・・' ) ",
                "INSERT INTO menber( name ) VALUES ( 'アナウンス「以上で魔王と少年の第1部の公開を終わります。ご覧くださりありがとうございました。お足元に・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「この映画結構面白かったなぁこれ。じゃ、アリアパン行くか」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'アリアパンの城・・・魔王「んでもって。ここがアリアパンか。家は一つしかないし、城も小さいしなんだここ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '青年「あんたは魔王か・・・とうとうここまできたか・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「お前が来ないからこっちからきてやったわ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '青年「お前を倒すために修業したからな。今の俺は強いぜ・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「今一度名を問おう。貴様がアースか」' ) ",
                "INSERT INTO menber( name ) VALUES ( '青年「いや違うね・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なに？貴様はアースではないのか？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '青年「俺の名は・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「俺の名は・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '神様「ワシの来来来世からワシが♪　ワシを探しに来たよ♪」' ) ",
                "INSERT INTO menber( name ) VALUES ( '二人「うるせえぇ！！！訳の分かんねぇこと言ってんじゃねぇ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「んで？貴様の名は？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '青年「俺は・・・・スーパーアースだ！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「じゃあお前いずれ負けんじゃん」' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース「は？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「さながら俺はセ〇か？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース「お前もいずれ殺されるやんｗｗｗｗｗｗｗ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「いや、俺魔王だし？そりゃ死ぬやろ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース「さっきから舐めたこと言いやがって・・台パン案件ですわ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「何言ってんだこいつ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース「俺もなぜ言ったかわからないが並行世界の俺が・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「もういいから戦おうぜ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース「うっせ。いまからぼこぼこにしてやるよ」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「はいはい」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「え？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース？「く・・・なかなかやるな・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あれ？一発で・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース？「こっからが僕だよー！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「ファッ！？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース？「てめぇは俺を怒らせた」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あ、あの～」' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース？「俺の真の力を開放する！全身全霊込めて貴様を倒す！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '～戦闘開始～' ) ",
                "INSERT INTO menber( name ) VALUES ( '超アース？「あ～れ～」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「え？俺の今までの苦労は？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「これどっきりかなにか？あはははは！そうだよね・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「かえろ・・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'エンディング' ) ",
                "INSERT INTO menber( name ) VALUES ( '見事本気の勇者を一発でたおした魔王。あのワガママボディから元のうつくしい肉体に戻しやることがなくなった魔王は暴飲暴食をしていた。' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あーあ。勇者弱いし人間どもは攻め込んでこないし暇だし魔物達も魔界に里帰りしてるしなんなんこれ。' ) ",
                "INSERT INTO menber( name ) VALUES ( 'やってらんね。もういいや。おーい執事―！おーいじいや！・・・誰もいなかったんだっけか・・・。もう寝よう・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '・・・・・・・・それから500年がたった' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「あれ？おかしくね？勇者誕生してる？500年くらいたったよね？え？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「魔王様。一つよろしいでしょうか？」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「うむ。許す」' ) ",
                "INSERT INTO menber( name ) VALUES ( '従者「このやり取り昔に一度・・・」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「よし。もう。いいか。みんなで遊びに行こうぜ！」' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔物達「イエェェェェェェェェェェェェェイ！！！！！！」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'その後この魔王は階段から足を滑らせて転び息絶え、魔物達は消えて世の中は平和になったのでした。' ) ",
                "INSERT INTO menber( name ) VALUES ( '魔王「なんていう結末はいかがですか？え？周回プレイがしたい？君も物好きだね！まぁとりあえずここで物語はおしまいさ！' ) ",
                "INSERT INTO menber( name ) VALUES ( 'まぁ、ストーリーを見直すシステムは今回導入していないからもう一回見たい人は最初から俺をやせさせようか！あくしろよ」' ) ",
                "INSERT INTO menber( name ) VALUES ( 'Fin' ) ",



        };

        //レコード作成
        for( int i=0; i<query_record_set.length; i++){
            db.execSQL(query_record_set[i]);
        }

        number = 1;

        db.close();




    }
}