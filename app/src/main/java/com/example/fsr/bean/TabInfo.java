package com.example.fsr.bean;

public class TabInfo {
    private final String[] ContentOfFang = new String[]{"屋子","屋顶","墙","门","窗户","台阶和路","烟囱"};
    private final String[] ContentOfShu = new String[]{"树","树干","树枝","树冠","树叶","果实","树干纹路"};
    private final String[] ContentOfRen = new String[]{"人","发型","眼睛","耳朵","鼻子","嘴巴","眉毛","脖子","躯干","手臂和手","腿和脚","饰品"};

    public String[] getContentOfFang() {
        return ContentOfFang;
    }

    public String[] getContentOfShu() {
        return ContentOfShu;
    }

    public String[] getContentOfRen() {
        return ContentOfRen;
    }
}
