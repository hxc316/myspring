package my.spring.xmlbean;

/**
 * Created by xc on 2017/10/26.
 */
public class XmlBean {

    public void out(){
        System.out.println("xmlBean create by xml : out ");
    }


    public XmlBean(String a,String b){
        System.out.println("XmlBean a: " + a);
        System.out.println("XmlBean b: " + b);
    }

}
