package com.rkeepermn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class mainClass {

    public void getResponseData(char[] xmlData) throws JSONException {
        String xmlResponseData = new String(xmlData);
        XML resdata = new XML(xmlData.toString());
//        System.out.println("Response ==> : " + xmlResponseData);
        // xmlResponseData-ийн утгыг Json хэлбэртэй өгөгдөл болгож төрөл хувиргалт хийх
        JSONObject data = XML.toJSONObject(xmlResponseData);
        System.out.println("Response ==> : " + data);
//        JSONObject a = jsonGetOrderList.getJSONObject("a");


//        if(a.has("Order")){
//            JSONObject order = (JSONObject) a.get("Order");
//            System.out.println("order ==> : " + a);
//            JSONObject order = (JSONObject) a.get("Order");
//            String visit = (String) order.get("visit");
//            String guid = (String)  order.get("guid");
//            String kdsstate = (String)  order.get("kdsstate");
//            String qmsNumber = "";
//            JSONArray arrExternalProps = (JSONArray) order.getJSONArray("ExternalProps");
//            for(int i = 0; i < arrExternalProps.length(); i++){
//                JSONObject prop = (JSONObject) arrExternalProps.getJSONObject(i);
//                if(prop.toString() == "{7DC7AF79-1D00-4573-BE8A-A02C6FA3B430}"){
//                    qmsNumber = (String) prop.get("value");
//                }
//            }
//
//            System.out.println("visit ==> : " + visit);
//            System.out.println("guid ==> : " + guid);
//            System.out.println("kdsstate ==> : " + kdsstate);
//            System.out.println("qmsNumber ==> : " + qmsNumber);
//        }
    }
}
