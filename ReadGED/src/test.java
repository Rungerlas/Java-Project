import java.util.Arrays;
public class test {    
public static String split(String str) {	
StringBuffer strb = new StringBuffer("");
String strz;
String strq = null;
String[] stry = str.split(" ");
String[] check = {"NAME","SEX","BIRT","DEAT","FAMC","FAMS","MARR","HUSB","WIFE","CHIL","DIV","DATE","HEAD","TRLR","NOTE"};
String check1 = "FAM";
String check2 = "INDI";
boolean fam = false;
boolean indi = false;
if(stry.length==2) {
fam = Arrays.asList(stry[1]).contains(check1);
indi = Arrays.asList(stry[1]).contains(check2);
if(fam) {
	stry[1] ="|"+stry[1]+"|"+"Y"+"|";
	for(int i = 0; i < stry.length; i++){
		strb.append(stry[i]+" ");
	}
}else if(indi){
	stry[1] ="|"+stry[1]+"|"+"Y"+"|";
	for(int i = 0; i < stry.length; i++){
		strb.append(stry[i]+" ");
}}
	else{
	boolean bcheck;
for (int i = 0; i < check.length; i++) {
	bcheck = Arrays.asList(stry[1]).contains(check[i]);
	if(bcheck) {
		strq = "Y";
		break;}else {
			strq = "N";
		}
}}
stry[1]="|"+stry[1]+"|"+strq+"|";
for(int i = 0; i < stry.length; i++){
	strb.append(stry[i]+" ");
}
	
}else {
fam = Arrays.asList(stry[2]).contains(check1);
indi = Arrays.asList(stry[2]).contains(check2);
if(fam) {
	stry[2] ="|"+stry[2]+"|"+"Y"+"|";
	strz = stry[2];
	stry[2]=stry[1];
	stry[1]=strz;
	strb.append(stry[0]);
	strb.append(stry[1]);
	for(int i = 2; i < stry.length; i++){
		strb.append(stry[i]+" ");
	}
}else if(indi){
	stry[2] ="|"+stry[2]+"|"+"Y"+"|";
	strz = stry[2];
	stry[2]=stry[1];
	stry[1]=strz;
	strb.append(stry[0]);
	strb.append(stry[1]);
	for(int i = 2; i < stry.length; i++){
		strb.append(stry[i]+" ");
}}
	else{
	boolean bcheck;
for (int i = 0; i < check.length; i++) {
	bcheck = Arrays.asList(stry[1]).contains(check[i]);
	if(bcheck) {
		strq = "Y";
		break;}else {
			strq = "N";
		}
}
stry[1]="|"+stry[1]+"|"+strq+"|";
strb.append(stry[0]);
strb.append(stry[1]);
for(int i = 2; i < stry.length; i++){
	strb.append(stry[i]+" ");}
}}
return strb.toString();}}

