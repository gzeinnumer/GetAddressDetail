# GetAddressDetail
 
#### GetAdress

[GetAddress.java](https://github.com/gzeinnumer/GetAddressDetail/blob/master/app/src/main/java/com/gzeinnumer/getaddressdetail/helper/GetAddress.java)

#### Model

[AddressKoordinat.java](https://github.com/gzeinnumer/GetAddressDetail/blob/master/app/src/main/java/com/gzeinnumer/getaddressdetail/model/AddressKoordinat.java)

#### MainActivity
```java
double lati = -0.9001564;
double longi = 100.4059463;

AddressKoordinat addressKoordinat = GetAddress.getAddressResult(getApplicationContext(), lati,longi);

((TextView)findViewById(R.id.tv)).setText(addressKoordinat.toString());
```

---

```
Copyright 2021 M. Fadli Zein
```