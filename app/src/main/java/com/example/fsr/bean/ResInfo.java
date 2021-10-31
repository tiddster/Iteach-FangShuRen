package com.example.fsr.bean;

import android.annotation.SuppressLint;
import android.content.Context;

import com.example.fsr.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResInfo implements Serializable {
    private List<PictureInfo> mInfoList;

    public ResInfo(List<PictureInfo> infoList) {
        mInfoList = infoList;
    }

    @SuppressLint("NonConstantResourceId")
    public String returnGoodResult(Context context){
        String stringG = "";
        String stringB = "";
        for(PictureInfo pictureInfo : mInfoList){
            switch (pictureInfo.getId()){
                case R.drawable.fangzi1: stringG += context.getApplicationContext().getText(R.string.塔)+"\n"; break;
                case R.drawable.fangzi2: stringG += context.getApplicationContext().getText(R.string.圆形房子)+"\n"; break;
                case R.drawable.fangzi3: stringB += context.getApplicationContext().getText(R.string.童话房子)+"\n"; break;
                case R.drawable.fangzi4: stringG += context.getApplicationContext().getText(R.string.现代化房子)+"\n"; break;
                case R.drawable.fangzi5: stringG += context.getApplicationContext().getText(R.string.传统房子)+"\n"; break;
                case R.drawable.fangzi6: stringB += context.getApplicationContext().getText(R.string.四合院型)+"\n"; break;
                case R.drawable.fangzi7: stringG += context.getApplicationContext().getText(R.string.亭台楼榭)+"\n"; break;

                case R.drawable.wuding2: stringB += context.getApplicationContext().getText(R.string.十字屋顶)+"\n"; break;
                case R.drawable.wuding3: stringB += context.getApplicationContext().getText(R.string.大屋顶)+"\n"; break;
                case R.drawable.wuding4: stringB += context.getApplicationContext().getText(R.string.黑屋顶)+"\n"; break;
                case R.drawable.wuding5: stringG += context.getApplicationContext().getText(R.string.鱼鳞)+"\n"; break;
                case R.drawable.wuding6: stringB += context.getApplicationContext().getText(R.string.瓦片)+"\n"; break;
                case R.drawable.wuding7: stringB += context.getApplicationContext().getText(R.string.网状屋顶)+"\n"; break;
                case R.drawable.wuding8: stringG += context.getApplicationContext().getText(R.string.屋顶线条加浓)+"\n"; break;
                case R.drawable.wuding9: stringB += context.getApplicationContext().getText(R.string.阁楼屋顶)+"\n"; break;
                case R.drawable.wuding10: stringG += context.getApplicationContext().getText(R.string.天窗屋顶)+"\n"; break;
                case R.drawable.wuding11: stringB += context.getApplicationContext().getText(R.string.屋顶线条较细)+"\n"; break;

                case R.drawable.qiang1: stringG += context.getApplicationContext().getText(R.string.普通墙壁)+"\n"; break;
                case R.drawable.qiang2: stringB += context.getApplicationContext().getText(R.string.单墙)+"\n"; break;
                case R.drawable.qiang3: stringB += context.getApplicationContext().getText(R.string.墙壁透明)+"\n"; break;
                case R.drawable.qiang4: stringB += context.getApplicationContext().getText(R.string.墙壁直立与垮掉)+"\n"; break;
                case R.drawable.qiang5: stringB += context.getApplicationContext().getText(R.string.墙的线条加浓)+"\n"; break;
                case R.drawable.qiang6: stringG += context.getApplicationContext().getText(R.string.墙壁轮廓及线条清楚)+"\n"; break;
                case R.drawable.qiang7: stringB += context.getApplicationContext().getText(R.string.岩块剥落的墙)+"\n"; break;
                case R.drawable.qiang8: stringB += context.getApplicationContext().getText(R.string.一推即倒的墙壁)+"\n"; break;
                case R.drawable.qiang9: stringB += context.getApplicationContext().getText(R.string.有墙纸的墙壁)+"\n"; break;
                case R.drawable.qiang10: stringB += context.getApplicationContext().getText(R.string.围墙)+"\n"; break;
                case R.drawable.qiang12: stringB += context.getApplicationContext().getText(R.string.单墙)+"\n"; break;
                case R.drawable.qiang13: stringB += context.getApplicationContext().getText(R.string.即将崩裂的墙壁)+"\n"; break;
                case R.drawable.qiang14: stringG += context.getApplicationContext().getText(R.string.坚固的墙壁)+"\n"; break;

                case R.drawable.chuanghu1: stringG += context.getApplicationContext().getText(R.string.圆形的窗户)+"\n"; break;
                case R.drawable.chuanghu2: stringG += context.getApplicationContext().getText(R.string.圆形的窗户)+"\n"; break;
                case R.drawable.chuanghu3: stringG += context.getApplicationContext().getText(R.string.圆形的窗户)+"\n"; break;
                case R.drawable.chuanghu4: stringG += context.getApplicationContext().getText(R.string.有窗帘的窗子)+"\n"; break;
                case R.drawable.chuanghu6: stringG += context.getApplicationContext().getText(R.string.装饰性窗户)+"\n"; break;
                case R.drawable.chuanghu7: stringG += context.getApplicationContext().getText(R.string.阴影窗)+"\n"; break;
                case R.drawable.chuanghu8: stringB += context.getApplicationContext().getText(R.string.染色玻璃窗户)+"\n"; break;
                case R.drawable.chuanghu9: stringG += context.getApplicationContext().getText(R.string.百叶)+"\n"; break;
                case R.drawable.chuanghu10: stringB += context.getApplicationContext().getText(R.string.像栅栏一样的窗户)+"\n"; break;
                case R.drawable.chuanghu11: stringG += context.getApplicationContext().getText(R.string.拉开窗帘的)+"\n"; break;
                case R.drawable.chuanghu12: stringB += context.getApplicationContext().getText(R.string.拉上窗帘的)+"\n"; break;
                case R.drawable.chuanghu13: stringB += context.getApplicationContext().getText(R.string.格子过多)+"\n"; break;
                case R.drawable.chuanghu14: stringB += context.getApplicationContext().getText(R.string.像栅栏一样的窗户)+"\n"; break;
                case R.drawable.chuanghu15: stringG += context.getApplicationContext().getText(R.string.星星形的窗户)+"\n"; break;

                case R.drawable.men2: stringG += context.getApplicationContext().getText(R.string.双扇门)+"\n"; break;
                case R.drawable.men3: stringB += context.getApplicationContext().getText(R.string.没有门把手)+"\n"; break;
                case R.drawable.men4: stringB += context.getApplicationContext().getText(R.string.门半开)+"\n"; break;
                case R.drawable.men5: stringB += context.getApplicationContext().getText(R.string.x门)+"\n"; break;
                case R.drawable.men6: stringB += context.getApplicationContext().getText(R.string.高门槛)+"\n"; break;
                case R.drawable.men7: stringG += context.getApplicationContext().getText(R.string.开门)+"\n"; break;
                case R.drawable.men8: stringB += context.getApplicationContext().getText(R.string.上锁门)+"\n"; break;
                case R.drawable.men9: stringB += context.getApplicationContext().getText(R.string.门被物挡住)+"\n"; break;
                case R.drawable.men10: stringB += context.getApplicationContext().getText(R.string.阴户状的门)+"\n"; break;
                case R.drawable.men11: stringB += context.getApplicationContext().getText(R.string.有窥视孔的门)+"\n"; break;

                case R.drawable.guoshi1: stringB += context.getApplicationContext().getText(R.string.果实大而多)+"\n"; break;
                case R.drawable.guoshi2: stringG += context.getApplicationContext().getText(R.string.果实大而少)+"\n"; break;
                case R.drawable.guoshi3: stringB += context.getApplicationContext().getText(R.string.果实小而多)+"\n"; break;
                case R.drawable.guoshi4: stringB += context.getApplicationContext().getText(R.string.果实小而少)+"\n"; break;
                case R.drawable.guoshi5: stringB += context.getApplicationContext().getText(R.string.果实掉落)+"\n"; break;
                case R.drawable.guoshi6: stringB += context.getApplicationContext().getText(R.string.果实青涩)+"\n"; break;

                case R.drawable.wenlu1: stringB += context.getApplicationContext().getText(R.string.树洞)+"\n"; break;
                case R.drawable.wenlu2: stringB += context.getApplicationContext().getText(R.string.树疤痕)+"\n"; break;
                case R.drawable.wenlu3: stringB += context.getApplicationContext().getText(R.string.折断痕迹)+"\n"; break;

                case R.drawable.shugan1: stringB += context.getApplicationContext().getText(R.string.树干左曲右直)+"\n"; break;
                case R.drawable.shugan2: stringB += context.getApplicationContext().getText(R.string.树干左直右曲)+"\n"; break;
                case R.drawable.shugan3: stringB += context.getApplicationContext().getText(R.string.树干平行线)+"\n"; break;
                case R.drawable.shugan4: stringB += context.getApplicationContext().getText(R.string.树干整体弯曲)+"\n"; break;
                case R.drawable.shugan5: stringB += context.getApplicationContext().getText(R.string.树根枯死)+"\n"; break;
                case R.drawable.shugan6: stringB += context.getApplicationContext().getText(R.string.树根向右膨胀)+"\n"; break;
                case R.drawable.shugan7: stringB += context.getApplicationContext().getText(R.string.树根向左膨胀)+"\n"; break;
                case R.drawable.shugan8: stringB += context.getApplicationContext().getText(R.string.树根向左右膨胀)+"\n"; break;
                case R.drawable.shugan9: stringG += context.getApplicationContext().getText(R.string.树干瓶型)+"\n"; break;
                case R.drawable.shugan10: stringB += context.getApplicationContext().getText(R.string.树干粗大)+"\n"; break;
                case R.drawable.shugan11: stringB += context.getApplicationContext().getText(R.string.树干细)+"\n"; break;
                case R.drawable.shugan12: stringB += context.getApplicationContext().getText(R.string.树干细)+"\n"; break;
                case R.drawable.shugan13: stringB += context.getApplicationContext().getText(R.string.树干被风吹弯)+"\n"; break;
                case R.drawable.shugan14: stringG += context.getApplicationContext().getText(R.string.树干顶部扩展)+"\n"; break;
                case R.drawable.shugan15: stringG += context.getApplicationContext().getText(R.string.树干顶部收于一点)+"\n"; break;
                case R.drawable.shugan16: stringB += context.getApplicationContext().getText(R.string.树干鹰爪)+"\n"; break;
                case R.drawable.shugan17: stringB += context.getApplicationContext().getText(R.string.树干黑色)+"\n"; break;
                case R.drawable.shugan18: stringB += context.getApplicationContext().getText(R.string.破烂的树皮)+"\n"; break;

                case R.drawable.shuguan1: stringG += context.getApplicationContext().getText(R.string.树冠圆形)+"\n"; break;
                case R.drawable.shuguan2: stringB += context.getApplicationContext().getText(R.string.树冠小型)+"\n"; break;
                case R.drawable.shuguan3: stringG += context.getApplicationContext().getText(R.string.树冠巨大)+"\n"; break;
                case R.drawable.shuguan4: stringB += context.getApplicationContext().getText(R.string.树冠杨柳下垂)+"\n"; break;
                case R.drawable.shuguan5: stringG += context.getApplicationContext().getText(R.string.树叶浓密型)+"\n"; break;

                case R.drawable.shuye2: stringG += context.getApplicationContext().getText(R.string.树叶单独生长型)+"\n"; break;
                case R.drawable.shuye3: stringG += context.getApplicationContext().getText(R.string.树叶手掌型)+"\n"; break;
                case R.drawable.shuye4: stringB += context.getApplicationContext().getText(R.string.树叶掉落)+"\n"; break;
                case R.drawable.shuye5: stringG += context.getApplicationContext().getText(R.string.树叶浓密型)+"\n"; break;
                case R.drawable.shuye6: stringB += context.getApplicationContext().getText(R.string.树叶稀少型)+"\n"; break;
                case R.drawable.shuye7: stringB += context.getApplicationContext().getText(R.string.树叶针叶型)+"\n"; break;
                case R.drawable.shuye8: stringB += context.getApplicationContext().getText(R.string.树叶掉落)+"\n"; break;

                case R.drawable.shuzhi1: stringG += context.getApplicationContext().getText(R.string.树枝1)+"\n"; break;
                case R.drawable.shuzhi2: stringG += context.getApplicationContext().getText(R.string.树枝2)+"\n"; break;
                case R.drawable.shuzhi3: stringB += context.getApplicationContext().getText(R.string.树枝3)+"\n"; break;
                case R.drawable.shuzhi4: stringB += context.getApplicationContext().getText(R.string.树枝小)+"\n"; break;
                case R.drawable.shuzhi5: stringB += context.getApplicationContext().getText(R.string.树冠杨柳下垂)+"\n"; break;
                case R.drawable.shuzhi6: stringB += context.getApplicationContext().getText(R.string.树枝折断)+"\n"; break;
                case R.drawable.shuzhi7: stringB += context.getApplicationContext().getText(R.string.树枝折断)+"\n"; break;
                case R.drawable.shuzhi8: stringB += context.getApplicationContext().getText(R.string.树枝横上生长)+"\n"; break;
                case R.drawable.shuzhi9: stringB += context.getApplicationContext().getText(R.string.树枝粗大)+"\n"; break;
                case R.drawable.shuzhi10: stringG += context.getApplicationContext().getText(R.string.树枝细致绘画)+"\n"; break;
                case R.drawable.shuzhi11: stringG += context.getApplicationContext().getText(R.string.树枝路径)+"\n"; break;
                case R.drawable.shuzhi12: stringB += context.getApplicationContext().getText(R.string.树枝横上生长)+"\n"; break;

                case R.drawable.shu1: stringB += context.getApplicationContext().getText(R.string.不对称的树)+"\n"; break;
                case R.drawable.shu2: stringG += context.getApplicationContext().getText(R.string.竹子)+"\n"; break;
                case R.drawable.shu3: stringG += context.getApplicationContext().getText(R.string.云状冠)+"\n"; break;
                case R.drawable.shu4: stringB += context.getApplicationContext().getText(R.string.直接有树干到单线树枝)+"\n"; break;
                case R.drawable.shu5: stringB += context.getApplicationContext().getText(R.string.左侧阴影)+"\n"; break;
                case R.drawable.shu6: stringG += context.getApplicationContext().getText(R.string.右侧阴影)+"\n"; break;
                case R.drawable.shu7: stringG += context.getApplicationContext().getText(R.string.椰树)+"\n"; break;
                case R.drawable.shu8: stringB += context.getApplicationContext().getText(R.string.折断痕迹)+"\n"; break;
                case R.drawable.shu9: stringB += context.getApplicationContext().getText(R.string.微风中的树)+"\n"; break;
                case R.drawable.shu10: stringG += context.getApplicationContext().getText(R.string.松树)+"\n"; break;
                case R.drawable.shu11: stringB += context.getApplicationContext().getText(R.string.狂风中的树)+"\n"; break;
                case R.drawable.shu12: stringB += context.getApplicationContext().getText(R.string.强调涂鸦线条)+"\n"; break;
                case R.drawable.shu13: stringG += context.getApplicationContext().getText(R.string.梅花)+"\n"; break;
                case R.drawable.shu14: stringB += context.getApplicationContext().getText(R.string.枯树)+"\n"; break;
                case R.drawable.shu15: stringB += context.getApplicationContext().getText(R.string.平冠)+"\n"; break;
                case R.drawable.shu16: stringB += context.getApplicationContext().getText(R.string.倒心形冠)+"\n"; break;

                case R.drawable.faxing1: stringB += context.getApplicationContext().getText(R.string.头大)+"\n"; break;
                case R.drawable.faxing2: stringB += context.getApplicationContext().getText(R.string.头大)+"\n"; break;
                case R.drawable.faxing3: stringB += context.getApplicationContext().getText(R.string.头小)+"\n"; break;
                case R.drawable.faxing4: stringB += context.getApplicationContext().getText(R.string.头小)+"\n"; break;
                case R.drawable.faxing5: stringG += context.getApplicationContext().getText(R.string.寸板头)+"\n"; break;
                case R.drawable.faxing6: stringG += context.getApplicationContext().getText(R.string.一个辫子向上)+"\n"; break;
                case R.drawable.faxing7: stringG += context.getApplicationContext().getText(R.string.短发)+"\n"; break;
                case R.drawable.faxing8: stringB += context.getApplicationContext().getText(R.string.光头)+"\n"; break;
                case R.drawable.faxing9: stringB += context.getApplicationContext().getText(R.string.女性化刘海)+"\n"; break;
                case R.drawable.faxing10: stringB += context.getApplicationContext().getText(R.string.三毛式)+"\n"; break;
                case R.drawable.faxing11: stringG += context.getApplicationContext().getText(R.string.头发浓密)+"\n"; break;
                case R.drawable.faxing12: stringB += context.getApplicationContext().getText(R.string.竖起来的头发)+"\n"; break;
                case R.drawable.faxing13: stringB += context.getApplicationContext().getText(R.string.头发稀疏)+"\n"; break;
                case R.drawable.faxing14: stringB += context.getApplicationContext().getText(R.string.画一撮毛)+"\n"; break;
                case R.drawable.faxing15: stringG += context.getApplicationContext().getText(R.string.直长发)+"\n"; break;
                case R.drawable.faxing16: stringB += context.getApplicationContext().getText(R.string.卷发)+"\n"; break;
                case R.drawable.faxing17: stringB += context.getApplicationContext().getText(R.string.脸部有阴影)+"\n"; break;

                case R.drawable.zuiba1: stringG += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.zuiba2: stringB += context.getApplicationContext().getText(R.string.过分强调嘴)+"\n"; break;
                case R.drawable.zuiba3: stringG += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.zuiba4: stringB += context.getApplicationContext().getText(R.string.呲牙咧嘴)+"\n"; break;
                case R.drawable.zuiba5: stringB += context.getApplicationContext().getText(R.string.咬住型)+"\n"; break;
                case R.drawable.zuiba6: stringG += context.getApplicationContext().getText(R.string.张大口)+"\n"; break;
                case R.drawable.zuiba7: stringB += context.getApplicationContext().getText(R.string.过分强调嘴)+"\n"; break;
                case R.drawable.zuiba8: stringG += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;

                /*
                case R.drawable.qugan1: string += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.qugan2: string += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.qugan3: string += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                */
                case R.drawable.qugan4: stringB += context.getApplicationContext().getText(R.string.士兵)+"\n"; break;
                case R.drawable.qugan5: stringG += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.qugan6: stringG += context.getApplicationContext().getText(R.string.水手)+"\n"; break;
                case R.drawable.qugan7: stringB += context.getApplicationContext().getText(R.string.牛仔)+"\n"; break;
                case R.drawable.qugan8: stringG += context.getApplicationContext().getText(R.string.西服)+"\n"; break;
                case R.drawable.shiping1: stringB += context.getApplicationContext().getText(R.string.士兵)+"\n"; break;
                case R.drawable.shiping2: stringB += context.getApplicationContext().getText(R.string.小丑)+"\n"; break;
                case R.drawable.shiping3: stringG += context.getApplicationContext().getText(R.string.水手)+"\n"; break;
                case R.drawable.shiping4: stringB += context.getApplicationContext().getText(R.string.牛仔)+"\n"; break;
                case R.drawable.shiping5: stringB += context.getApplicationContext().getText(R.string.头饰)+"\n"; break;
                case R.drawable.shiping6: stringG += context.getApplicationContext().getText(R.string.装饰物)+"\n"; break;
                case R.drawable.shiping7: stringB += context.getApplicationContext().getText(R.string.帽子)+"\n"; break;
                case R.drawable.shiping8: stringG += context.getApplicationContext().getText(R.string.领带)+"\n"; break;
                case R.drawable.shiping9: stringG += context.getApplicationContext().getText(R.string.领带)+"\n"; break;

                case R.drawable.meimao6: stringG += context.getApplicationContext().getText(R.string.整齐有力的眉毛)+"\n"; break;
                case R.drawable.meimao7: stringG += context.getApplicationContext().getText(R.string.女化柳叶眉)+"\n"; break;
                case R.drawable.meimao8: stringG += context.getApplicationContext().getText(R.string.男化浓眉)+"\n"; break;
                case R.drawable.meimao9: stringB += context.getApplicationContext().getText(R.string.眉毛上扬)+"\n"; break;
                case R.drawable.meimao10: stringB += context.getApplicationContext().getText(R.string.扫帚般的眉毛)+"\n"; break;

                case R.drawable.yanjing5: stringB += context.getApplicationContext().getText(R.string.大眼睛)+"\n"; break;
                case R.drawable.yanjing6: stringB += context.getApplicationContext().getText(R.string.一眼大一眼小)+"\n"; break;
                case R.drawable.yanjing7: stringB += "无生气、妄想、幻想"+"\n"; break;
                case R.drawable.yanjing8: stringB += context.getApplicationContext().getText(R.string.非常细小的眼镜)+"\n"; break;
                case R.drawable.yanjing9: stringB += context.getApplicationContext().getText(R.string.大眼睛)+"\n"; break;
                case R.drawable.yanjing10: stringB += context.getApplicationContext().getText(R.string.大眼睛)+"\n"; break;
                case R.drawable.yanjing11: stringB += context.getApplicationContext().getText(R.string.不画瞳孔)+"\n"; break;


                case R.drawable.fujia1: stringB += context.getApplicationContext().getText(R.string.下雨)+"\n"; break;
                case R.drawable.fujia2: stringB += context.getApplicationContext().getText(R.string.云朵)+"\n"; break;
                case R.drawable.fujia3: stringB += context.getApplicationContext().getText(R.string.乌云)+"\n"; break;
                case R.drawable.fujia4: stringB += context.getApplicationContext().getText(R.string.下雨)+"\n"; break;
                case R.drawable.fujia5: stringG += context.getApplicationContext().getText(R.string.乌云画成如意)+"\n"; break;
                case R.drawable.fujia7: stringG += context.getApplicationContext().getText(R.string.喜鹊)+"\n"; break;
                case R.drawable.fujia8: stringG += context.getApplicationContext().getText(R.string.星星形的窗户)+"\n"; break;
                case R.drawable.fujia9: stringB += context.getApplicationContext().getText(R.string.月亮)+"\n"; break;
                case R.drawable.fujia12: stringG += context.getApplicationContext().getText(R.string.落日)+"\n"; break;
                case R.drawable.fujia13: stringB += context.getApplicationContext().getText(R.string.远景大太阳)+"\n"; break;
                case R.drawable.fujia14: stringB += context.getApplicationContext().getText(R.string.四分之一的太阳)+"\n"; break;
                case R.drawable.fujia15: stringB += context.getApplicationContext().getText(R.string.暗淡的太阳)+"\n"; break;
                case R.drawable.fujia16: stringG += context.getApplicationContext().getText(R.string.喜鹊)+"\n"; break;
                case R.drawable.fujia17: stringG += context.getApplicationContext().getText(R.string.鱼)+"\n"; break;
                case R.drawable.fujia18: stringG += context.getApplicationContext().getText(R.string.鱼)+"\n"; break;
                case R.drawable.fujia19: stringB += context.getApplicationContext().getText(R.string.小草小花)+"\n"; break;
                case R.drawable.fujia20: stringB += context.getApplicationContext().getText(R.string.小草小花)+"\n"; break;
                case R.drawable.fujia21: stringB += context.getApplicationContext().getText(R.string.章鱼或水母)+"\n"; break;
                case R.drawable.fujia22: stringB += context.getApplicationContext().getText(R.string.啄木鸟)+"\n"; break;
                case R.drawable.fujia23: stringG += context.getApplicationContext().getText(R.string.鹰)+"\n"; break;
                case R.drawable.fujia24: stringB += context.getApplicationContext().getText(R.string.栅栏)+"\n"; break;
                case R.drawable.fujia25: stringG += context.getApplicationContext().getText(R.string.矮木和花)+"\n"; break;
                case R.drawable.fujia26: stringB += context.getApplicationContext().getText(R.string.小草小花)+"\n"; break;
                case R.drawable.fujia27: stringG += context.getApplicationContext().getText(R.string.矮木和花)+"\n"; break;
                case R.drawable.fujia28: stringG += context.getApplicationContext().getText(R.string.山)+"\n"; break;
                case R.drawable.fujia29: stringG += context.getApplicationContext().getText(R.string.一排大雁)+"\n"; break;
                case R.drawable.fujia30: stringG += context.getApplicationContext().getText(R.string.装饰物)+"\n"; break;

                case R.drawable.ren1: stringB += context.getApplicationContext().getText(R.string.自画像背影)+"\n"; break;
                case R.drawable.ren2: stringB += context.getApplicationContext().getText(R.string.树枝横上生长)+"\n"; break;
                case R.drawable.ren3: stringB += context.getApplicationContext().getText(R.string.符号化的人)+"\n"; break;
            }
        }
        return stringG;
    }

    @SuppressLint("NonConstantResourceId")
    public String returnBadResult(Context context){
        String stringG = "";
        String stringB = "";
        for(PictureInfo pictureInfo : mInfoList){
            stringG += "• ";
            switch (pictureInfo.getId()){
                case R.drawable.fangzi1: stringG += context.getApplicationContext().getText(R.string.塔)+"\n"; break;
                case R.drawable.fangzi2: stringG += context.getApplicationContext().getText(R.string.圆形房子)+"\n"; break;
                case R.drawable.fangzi3: stringB += context.getApplicationContext().getText(R.string.童话房子)+"\n"; break;
                case R.drawable.fangzi4: stringG += context.getApplicationContext().getText(R.string.现代化房子)+"\n"; break;
                case R.drawable.fangzi5: stringG += context.getApplicationContext().getText(R.string.传统房子)+"\n"; break;
                case R.drawable.fangzi6: stringB += context.getApplicationContext().getText(R.string.四合院型)+"\n"; break;
                case R.drawable.fangzi7: stringG += context.getApplicationContext().getText(R.string.亭台楼榭)+"\n"; break;

                case R.drawable.wuding2: stringB += context.getApplicationContext().getText(R.string.十字屋顶)+"\n"; break;
                case R.drawable.wuding3: stringB += context.getApplicationContext().getText(R.string.大屋顶)+"\n"; break;
                case R.drawable.wuding4: stringB += context.getApplicationContext().getText(R.string.黑屋顶)+"\n"; break;
                case R.drawable.wuding5: stringG += context.getApplicationContext().getText(R.string.鱼鳞)+"\n"; break;
                case R.drawable.wuding6: stringB += context.getApplicationContext().getText(R.string.瓦片)+"\n"; break;
                case R.drawable.wuding7: stringB += context.getApplicationContext().getText(R.string.网状屋顶)+"\n"; break;
                case R.drawable.wuding8: stringG += context.getApplicationContext().getText(R.string.屋顶线条加浓)+"\n"; break;
                case R.drawable.wuding9: stringB += context.getApplicationContext().getText(R.string.阁楼屋顶)+"\n"; break;
                case R.drawable.wuding10: stringG += context.getApplicationContext().getText(R.string.天窗屋顶)+"\n"; break;
                case R.drawable.wuding11: stringB += context.getApplicationContext().getText(R.string.屋顶线条较细)+"\n"; break;

                case R.drawable.qiang1: stringG += context.getApplicationContext().getText(R.string.普通墙壁)+"\n"; break;
                case R.drawable.qiang2: stringB += context.getApplicationContext().getText(R.string.单墙)+"\n"; break;
                case R.drawable.qiang3: stringB += context.getApplicationContext().getText(R.string.墙壁透明)+"\n"; break;
                case R.drawable.qiang4: stringB += context.getApplicationContext().getText(R.string.墙壁直立与垮掉)+"\n"; break;
                case R.drawable.qiang5: stringB += context.getApplicationContext().getText(R.string.墙的线条加浓)+"\n"; break;
                case R.drawable.qiang6: stringG += context.getApplicationContext().getText(R.string.墙壁轮廓及线条清楚)+"\n"; break;
                case R.drawable.qiang7: stringB += context.getApplicationContext().getText(R.string.岩块剥落的墙)+"\n"; break;
                case R.drawable.qiang8: stringB += context.getApplicationContext().getText(R.string.一推即倒的墙壁)+"\n"; break;
                case R.drawable.qiang9: stringB += context.getApplicationContext().getText(R.string.有墙纸的墙壁)+"\n"; break;
                case R.drawable.qiang10: stringB += context.getApplicationContext().getText(R.string.围墙)+"\n"; break;
                case R.drawable.qiang12: stringB += context.getApplicationContext().getText(R.string.单墙)+"\n"; break;
                case R.drawable.qiang13: stringB += context.getApplicationContext().getText(R.string.即将崩裂的墙壁)+"\n"; break;
                case R.drawable.qiang14: stringG += context.getApplicationContext().getText(R.string.坚固的墙壁)+"\n"; break;

                case R.drawable.chuanghu1: stringG += context.getApplicationContext().getText(R.string.圆形的窗户)+"\n"; break;
                case R.drawable.chuanghu2: stringG += context.getApplicationContext().getText(R.string.圆形的窗户)+"\n"; break;
                case R.drawable.chuanghu3: stringG += context.getApplicationContext().getText(R.string.圆形的窗户)+"\n"; break;
                case R.drawable.chuanghu4: stringG += context.getApplicationContext().getText(R.string.有窗帘的窗子)+"\n"; break;
                case R.drawable.chuanghu6: stringG += context.getApplicationContext().getText(R.string.装饰性窗户)+"\n"; break;
                case R.drawable.chuanghu7: stringG += context.getApplicationContext().getText(R.string.阴影窗)+"\n"; break;
                case R.drawable.chuanghu8: stringB += context.getApplicationContext().getText(R.string.染色玻璃窗户)+"\n"; break;
                case R.drawable.chuanghu9: stringG += context.getApplicationContext().getText(R.string.百叶)+"\n"; break;
                case R.drawable.chuanghu10: stringB += context.getApplicationContext().getText(R.string.像栅栏一样的窗户)+"\n"; break;
                case R.drawable.chuanghu11: stringG += context.getApplicationContext().getText(R.string.拉开窗帘的)+"\n"; break;
                case R.drawable.chuanghu12: stringB += context.getApplicationContext().getText(R.string.拉上窗帘的)+"\n"; break;
                case R.drawable.chuanghu13: stringB += context.getApplicationContext().getText(R.string.格子过多)+"\n"; break;
                case R.drawable.chuanghu14: stringB += context.getApplicationContext().getText(R.string.像栅栏一样的窗户)+"\n"; break;
                case R.drawable.chuanghu15: stringG += context.getApplicationContext().getText(R.string.星星形的窗户)+"\n"; break;

                case R.drawable.men2: stringG += context.getApplicationContext().getText(R.string.双扇门)+"\n"; break;
                case R.drawable.men3: stringB += context.getApplicationContext().getText(R.string.没有门把手)+"\n"; break;
                case R.drawable.men4: stringB += context.getApplicationContext().getText(R.string.门半开)+"\n"; break;
                case R.drawable.men5: stringB += context.getApplicationContext().getText(R.string.x门)+"\n"; break;
                case R.drawable.men6: stringB += context.getApplicationContext().getText(R.string.高门槛)+"\n"; break;
                case R.drawable.men7: stringG += context.getApplicationContext().getText(R.string.开门)+"\n"; break;
                case R.drawable.men8: stringB += context.getApplicationContext().getText(R.string.上锁门)+"\n"; break;
                case R.drawable.men9: stringB += context.getApplicationContext().getText(R.string.门被物挡住)+"\n"; break;
                case R.drawable.men10: stringB += context.getApplicationContext().getText(R.string.阴户状的门)+"\n"; break;
                case R.drawable.men11: stringB += context.getApplicationContext().getText(R.string.有窥视孔的门)+"\n"; break;

                case R.drawable.guoshi1: stringB += context.getApplicationContext().getText(R.string.果实大而多)+"\n"; break;
                case R.drawable.guoshi2: stringG += context.getApplicationContext().getText(R.string.果实大而少)+"\n"; break;
                case R.drawable.guoshi3: stringB += context.getApplicationContext().getText(R.string.果实小而多)+"\n"; break;
                case R.drawable.guoshi4: stringB += context.getApplicationContext().getText(R.string.果实小而少)+"\n"; break;
                case R.drawable.guoshi5: stringB += context.getApplicationContext().getText(R.string.果实掉落)+"\n"; break;
                case R.drawable.guoshi6: stringB += context.getApplicationContext().getText(R.string.果实青涩)+"\n"; break;

                case R.drawable.wenlu1: stringB += context.getApplicationContext().getText(R.string.树洞)+"\n"; break;
                case R.drawable.wenlu2: stringB += context.getApplicationContext().getText(R.string.树疤痕)+"\n"; break;
                case R.drawable.wenlu3: stringB += context.getApplicationContext().getText(R.string.折断痕迹)+"\n"; break;

                case R.drawable.shugan1: stringB += context.getApplicationContext().getText(R.string.树干左曲右直)+"\n"; break;
                case R.drawable.shugan2: stringB += context.getApplicationContext().getText(R.string.树干左直右曲)+"\n"; break;
                case R.drawable.shugan3: stringB += context.getApplicationContext().getText(R.string.树干平行线)+"\n"; break;
                case R.drawable.shugan4: stringB += context.getApplicationContext().getText(R.string.树干整体弯曲)+"\n"; break;
                case R.drawable.shugan5: stringB += context.getApplicationContext().getText(R.string.树根枯死)+"\n"; break;
                case R.drawable.shugan6: stringB += context.getApplicationContext().getText(R.string.树根向右膨胀)+"\n"; break;
                case R.drawable.shugan7: stringB += context.getApplicationContext().getText(R.string.树根向左膨胀)+"\n"; break;
                case R.drawable.shugan8: stringB += context.getApplicationContext().getText(R.string.树根向左右膨胀)+"\n"; break;
                case R.drawable.shugan9: stringG += context.getApplicationContext().getText(R.string.树干瓶型)+"\n"; break;
                case R.drawable.shugan10: stringB += context.getApplicationContext().getText(R.string.树干粗大)+"\n"; break;
                case R.drawable.shugan11: stringB += context.getApplicationContext().getText(R.string.树干细)+"\n"; break;
                case R.drawable.shugan12: stringB += context.getApplicationContext().getText(R.string.树干细)+"\n"; break;
                case R.drawable.shugan13: stringB += context.getApplicationContext().getText(R.string.树干被风吹弯)+"\n"; break;
                case R.drawable.shugan14: stringG += context.getApplicationContext().getText(R.string.树干顶部扩展)+"\n"; break;
                case R.drawable.shugan15: stringG += context.getApplicationContext().getText(R.string.树干顶部收于一点)+"\n"; break;
                case R.drawable.shugan16: stringB += context.getApplicationContext().getText(R.string.树干鹰爪)+"\n"; break;
                case R.drawable.shugan17: stringB += context.getApplicationContext().getText(R.string.树干黑色)+"\n"; break;
                case R.drawable.shugan18: stringB += context.getApplicationContext().getText(R.string.破烂的树皮)+"\n"; break;

                case R.drawable.shuguan1: stringG += context.getApplicationContext().getText(R.string.树冠圆形)+"\n"; break;
                case R.drawable.shuguan2: stringB += context.getApplicationContext().getText(R.string.树冠小型)+"\n"; break;
                case R.drawable.shuguan3: stringG += context.getApplicationContext().getText(R.string.树冠巨大)+"\n"; break;
                case R.drawable.shuguan4: stringB += context.getApplicationContext().getText(R.string.树冠杨柳下垂)+"\n"; break;
                case R.drawable.shuguan5: stringG += context.getApplicationContext().getText(R.string.树叶浓密型)+"\n"; break;

                case R.drawable.shuye2: stringG += context.getApplicationContext().getText(R.string.树叶单独生长型)+"\n"; break;
                case R.drawable.shuye3: stringG += context.getApplicationContext().getText(R.string.树叶手掌型)+"\n"; break;
                case R.drawable.shuye4: stringB += context.getApplicationContext().getText(R.string.树叶掉落)+"\n"; break;
                case R.drawable.shuye5: stringG += context.getApplicationContext().getText(R.string.树叶浓密型)+"\n"; break;
                case R.drawable.shuye6: stringB += context.getApplicationContext().getText(R.string.树叶稀少型)+"\n"; break;
                case R.drawable.shuye7: stringB += context.getApplicationContext().getText(R.string.树叶针叶型)+"\n"; break;
                case R.drawable.shuye8: stringB += context.getApplicationContext().getText(R.string.树叶掉落)+"\n"; break;

                case R.drawable.shuzhi1: stringG += context.getApplicationContext().getText(R.string.树枝1)+"\n"; break;
                case R.drawable.shuzhi2: stringG += context.getApplicationContext().getText(R.string.树枝2)+"\n"; break;
                case R.drawable.shuzhi3: stringB += context.getApplicationContext().getText(R.string.树枝3)+"\n"; break;
                case R.drawable.shuzhi4: stringB += context.getApplicationContext().getText(R.string.树枝小)+"\n"; break;
                case R.drawable.shuzhi5: stringB += context.getApplicationContext().getText(R.string.树冠杨柳下垂)+"\n"; break;
                case R.drawable.shuzhi6: stringB += context.getApplicationContext().getText(R.string.树枝折断)+"\n"; break;
                case R.drawable.shuzhi7: stringB += context.getApplicationContext().getText(R.string.树枝折断)+"\n"; break;
                case R.drawable.shuzhi8: stringB += context.getApplicationContext().getText(R.string.树枝横上生长)+"\n"; break;
                case R.drawable.shuzhi9: stringB += context.getApplicationContext().getText(R.string.树枝粗大)+"\n"; break;
                case R.drawable.shuzhi10: stringG += context.getApplicationContext().getText(R.string.树枝细致绘画)+"\n"; break;
                case R.drawable.shuzhi11: stringG += context.getApplicationContext().getText(R.string.树枝路径)+"\n"; break;
                case R.drawable.shuzhi12: stringB += context.getApplicationContext().getText(R.string.树枝横上生长)+"\n"; break;

                case R.drawable.shu1: stringB += context.getApplicationContext().getText(R.string.不对称的树)+"\n"; break;
                case R.drawable.shu2: stringG += context.getApplicationContext().getText(R.string.竹子)+"\n"; break;
                case R.drawable.shu3: stringG += context.getApplicationContext().getText(R.string.云状冠)+"\n"; break;
                case R.drawable.shu4: stringB += context.getApplicationContext().getText(R.string.直接有树干到单线树枝)+"\n"; break;
                case R.drawable.shu5: stringB += context.getApplicationContext().getText(R.string.左侧阴影)+"\n"; break;
                case R.drawable.shu6: stringG += context.getApplicationContext().getText(R.string.右侧阴影)+"\n"; break;
                case R.drawable.shu7: stringG += context.getApplicationContext().getText(R.string.椰树)+"\n"; break;
                case R.drawable.shu8: stringB += context.getApplicationContext().getText(R.string.折断痕迹)+"\n"; break;
                case R.drawable.shu9: stringB += context.getApplicationContext().getText(R.string.微风中的树)+"\n"; break;
                case R.drawable.shu10: stringG += context.getApplicationContext().getText(R.string.松树)+"\n"; break;
                case R.drawable.shu11: stringB += context.getApplicationContext().getText(R.string.狂风中的树)+"\n"; break;
                case R.drawable.shu12: stringB += context.getApplicationContext().getText(R.string.强调涂鸦线条)+"\n"; break;
                case R.drawable.shu13: stringG += context.getApplicationContext().getText(R.string.梅花)+"\n"; break;
                case R.drawable.shu14: stringB += context.getApplicationContext().getText(R.string.枯树)+"\n"; break;
                case R.drawable.shu15: stringB += context.getApplicationContext().getText(R.string.平冠)+"\n"; break;
                case R.drawable.shu16: stringB += context.getApplicationContext().getText(R.string.倒心形冠)+"\n"; break;

                case R.drawable.faxing1: stringB += context.getApplicationContext().getText(R.string.头大)+"\n"; break;
                case R.drawable.faxing2: stringB += context.getApplicationContext().getText(R.string.头大)+"\n"; break;
                case R.drawable.faxing3: stringB += context.getApplicationContext().getText(R.string.头小)+"\n"; break;
                case R.drawable.faxing4: stringB += context.getApplicationContext().getText(R.string.头小)+"\n"; break;
                case R.drawable.faxing5: stringG += context.getApplicationContext().getText(R.string.寸板头)+"\n"; break;
                case R.drawable.faxing6: stringG += context.getApplicationContext().getText(R.string.一个辫子向上)+"\n"; break;
                case R.drawable.faxing7: stringG += context.getApplicationContext().getText(R.string.短发)+"\n"; break;
                case R.drawable.faxing8: stringB += context.getApplicationContext().getText(R.string.光头)+"\n"; break;
                case R.drawable.faxing9: stringB += context.getApplicationContext().getText(R.string.女性化刘海)+"\n"; break;
                case R.drawable.faxing10: stringB += context.getApplicationContext().getText(R.string.三毛式)+"\n"; break;
                case R.drawable.faxing11: stringG += context.getApplicationContext().getText(R.string.头发浓密)+"\n"; break;
                case R.drawable.faxing12: stringB += context.getApplicationContext().getText(R.string.竖起来的头发)+"\n"; break;
                case R.drawable.faxing13: stringB += context.getApplicationContext().getText(R.string.头发稀疏)+"\n"; break;
                case R.drawable.faxing14: stringB += context.getApplicationContext().getText(R.string.画一撮毛)+"\n"; break;
                case R.drawable.faxing15: stringG += context.getApplicationContext().getText(R.string.直长发)+"\n"; break;
                case R.drawable.faxing16: stringB += context.getApplicationContext().getText(R.string.卷发)+"\n"; break;
                case R.drawable.faxing17: stringB += context.getApplicationContext().getText(R.string.脸部有阴影)+"\n"; break;

                case R.drawable.zuiba1: stringG += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.zuiba2: stringB += context.getApplicationContext().getText(R.string.过分强调嘴)+"\n"; break;
                case R.drawable.zuiba3: stringG += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.zuiba4: stringB += context.getApplicationContext().getText(R.string.呲牙咧嘴)+"\n"; break;
                case R.drawable.zuiba5: stringB += context.getApplicationContext().getText(R.string.咬住型)+"\n"; break;
                case R.drawable.zuiba6: stringG += context.getApplicationContext().getText(R.string.张大口)+"\n"; break;
                case R.drawable.zuiba7: stringB += context.getApplicationContext().getText(R.string.过分强调嘴)+"\n"; break;
                case R.drawable.zuiba8: stringG += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;

                /*
                case R.drawable.qugan1: string += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.qugan2: string += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.qugan3: string += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                */
                case R.drawable.qugan4: stringB += context.getApplicationContext().getText(R.string.士兵)+"\n"; break;
                case R.drawable.qugan5: stringG += context.getApplicationContext().getText(R.string.嘴唇紧闭)+"\n"; break;
                case R.drawable.qugan6: stringG += context.getApplicationContext().getText(R.string.水手)+"\n"; break;
                case R.drawable.qugan7: stringB += context.getApplicationContext().getText(R.string.牛仔)+"\n"; break;
                case R.drawable.qugan8: stringG += context.getApplicationContext().getText(R.string.西服)+"\n"; break;
                case R.drawable.shiping1: stringB += context.getApplicationContext().getText(R.string.士兵)+"\n"; break;
                case R.drawable.shiping2: stringB += context.getApplicationContext().getText(R.string.小丑)+"\n"; break;
                case R.drawable.shiping3: stringG += context.getApplicationContext().getText(R.string.水手)+"\n"; break;
                case R.drawable.shiping4: stringB += context.getApplicationContext().getText(R.string.牛仔)+"\n"; break;
                case R.drawable.shiping5: stringB += context.getApplicationContext().getText(R.string.头饰)+"\n"; break;
                case R.drawable.shiping6: stringG += context.getApplicationContext().getText(R.string.装饰物)+"\n"; break;
                case R.drawable.shiping7: stringB += context.getApplicationContext().getText(R.string.帽子)+"\n"; break;
                case R.drawable.shiping8: stringG += context.getApplicationContext().getText(R.string.领带)+"\n"; break;
                case R.drawable.shiping9: stringG += context.getApplicationContext().getText(R.string.领带)+"\n"; break;

                case R.drawable.meimao6: stringG += context.getApplicationContext().getText(R.string.整齐有力的眉毛)+"\n"; break;
                case R.drawable.meimao7: stringG += context.getApplicationContext().getText(R.string.女化柳叶眉)+"\n"; break;
                case R.drawable.meimao8: stringG += context.getApplicationContext().getText(R.string.男化浓眉)+"\n"; break;
                case R.drawable.meimao9: stringB += context.getApplicationContext().getText(R.string.眉毛上扬)+"\n"; break;
                case R.drawable.meimao10: stringB += context.getApplicationContext().getText(R.string.扫帚般的眉毛)+"\n"; break;

                case R.drawable.yanjing5: stringB += context.getApplicationContext().getText(R.string.大眼睛)+"\n"; break;
                case R.drawable.yanjing6: stringB += context.getApplicationContext().getText(R.string.一眼大一眼小)+"\n"; break;
                case R.drawable.yanjing7: stringB += "无生气、妄想、幻想"+"\n"; break;
                case R.drawable.yanjing8: stringB += context.getApplicationContext().getText(R.string.非常细小的眼镜)+"\n"; break;
                case R.drawable.yanjing9: stringB += context.getApplicationContext().getText(R.string.大眼睛)+"\n"; break;
                case R.drawable.yanjing10: stringB += context.getApplicationContext().getText(R.string.大眼睛)+"\n"; break;
                case R.drawable.yanjing11: stringB += context.getApplicationContext().getText(R.string.不画瞳孔)+"\n"; break;


                case R.drawable.fujia1: stringB += context.getApplicationContext().getText(R.string.下雨)+"\n"; break;
                case R.drawable.fujia2: stringB += context.getApplicationContext().getText(R.string.云朵)+"\n"; break;
                case R.drawable.fujia3: stringB += context.getApplicationContext().getText(R.string.乌云)+"\n"; break;
                case R.drawable.fujia4: stringB += context.getApplicationContext().getText(R.string.下雨)+"\n"; break;
                case R.drawable.fujia5: stringG += context.getApplicationContext().getText(R.string.乌云画成如意)+"\n"; break;
                case R.drawable.fujia7: stringG += context.getApplicationContext().getText(R.string.喜鹊)+"\n"; break;
                case R.drawable.fujia8: stringG += context.getApplicationContext().getText(R.string.星星形的窗户)+"\n"; break;
                case R.drawable.fujia9: stringB += context.getApplicationContext().getText(R.string.月亮)+"\n"; break;
                case R.drawable.fujia12: stringG += context.getApplicationContext().getText(R.string.落日)+"\n"; break;
                case R.drawable.fujia13: stringB += context.getApplicationContext().getText(R.string.远景大太阳)+"\n"; break;
                case R.drawable.fujia14: stringB += context.getApplicationContext().getText(R.string.四分之一的太阳)+"\n"; break;
                case R.drawable.fujia15: stringB += context.getApplicationContext().getText(R.string.暗淡的太阳)+"\n"; break;
                case R.drawable.fujia16: stringG += context.getApplicationContext().getText(R.string.喜鹊)+"\n"; break;
                case R.drawable.fujia17: stringG += context.getApplicationContext().getText(R.string.鱼)+"\n"; break;
                case R.drawable.fujia18: stringG += context.getApplicationContext().getText(R.string.鱼)+"\n"; break;
                case R.drawable.fujia19: stringB += context.getApplicationContext().getText(R.string.小草小花)+"\n"; break;
                case R.drawable.fujia20: stringB += context.getApplicationContext().getText(R.string.小草小花)+"\n"; break;
                case R.drawable.fujia21: stringB += context.getApplicationContext().getText(R.string.章鱼或水母)+"\n"; break;
                case R.drawable.fujia22: stringB += context.getApplicationContext().getText(R.string.啄木鸟)+"\n"; break;
                case R.drawable.fujia23: stringG += context.getApplicationContext().getText(R.string.鹰)+"\n"; break;
                case R.drawable.fujia24: stringB += context.getApplicationContext().getText(R.string.栅栏)+"\n"; break;
                case R.drawable.fujia25: stringG += context.getApplicationContext().getText(R.string.矮木和花)+"\n"; break;
                case R.drawable.fujia26: stringB += context.getApplicationContext().getText(R.string.小草小花)+"\n"; break;
                case R.drawable.fujia27: stringG += context.getApplicationContext().getText(R.string.矮木和花)+"\n"; break;
                case R.drawable.fujia28: stringG += context.getApplicationContext().getText(R.string.山)+"\n"; break;
                case R.drawable.fujia29: stringG += context.getApplicationContext().getText(R.string.一排大雁)+"\n"; break;
                case R.drawable.fujia30: stringG += context.getApplicationContext().getText(R.string.装饰物)+"\n"; break;

                case R.drawable.ren1: stringB += context.getApplicationContext().getText(R.string.自画像背影)+"\n"; break;
                case R.drawable.ren2: stringB += context.getApplicationContext().getText(R.string.树枝横上生长)+"\n"; break;
                case R.drawable.ren3: stringB += context.getApplicationContext().getText(R.string.符号化的人)+"\n"; break;
            }
        }
        return stringB;
    }
}
