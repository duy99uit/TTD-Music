package com.example.appnhac.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Mv implements Serializable {

@SerializedName("Idmv")
@Expose
private String idmv;
@SerializedName("Tenmv")
@Expose
private String tenmv;
@SerializedName("Hinhmv")
@Expose
private String hinhmv;
@SerializedName("Linkmv")
@Expose
private String linkmv;

public String getIdmv() {
return idmv;
}

public void setIdmv(String idmv) {
this.idmv = idmv;
}

public String getTenmv() {
return tenmv;
}

public void setTenmv(String tenmv) {
this.tenmv = tenmv;
}

public String getHinhmv() {
return hinhmv;
}

public void setHinhmv(String hinhmv) {
this.hinhmv = hinhmv;
}

public String getLinkmv() {
return linkmv;
}

public void setLinkmv(String linkmv) {
this.linkmv = linkmv;
}

}