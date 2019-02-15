package com.github.rjbx.givetrack.data.entry;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class Giving {

    private String ein;
    private String name;
    private String locationStreet;
    private String locationDetail;
    private String locationCity;
    private String locationState;
    private String locationZip;
    private String homepageUrl;
    private String navigatorUrl;
    private String phone;
    private String email;
    private String impact;
    private int type;
    private int frequency;
    private String percent;

    /**
     * Provides default constructor required for object relational mapping.
     */
    public Giving() {}

    /**
     * Provides POJO constructor required for object relational mapping.
     */
    public Giving(
            String ein,
            String name,
            String locationStreet,
            String locationDetail,
            String locationCity,
            String locationState,
            String locationZip,
            String homepageUrl,
            String navigatorUrl,
            String phone,
            String email,
            String impact,
            int type,
            int frequency,
            String percent) {
        this.ein = ein;
        this.name = name ;
        this.locationStreet = locationStreet;
        this.locationDetail = locationDetail;
        this.locationCity = locationCity;
        this.locationState = locationState;
        this.locationZip = locationZip;
        this.homepageUrl = homepageUrl;
        this.navigatorUrl = navigatorUrl;
        this.phone = phone;
        this.email = email;
        this.impact = impact;
        this.type = type;
        this.frequency = frequency;
        this.percent = percent;
    }

    public String getEin() {
        return ein;
    }
    public void setEin(String ein) {
        this.ein = ein;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocationStreet() {
        return locationStreet;
    }
    public void setLocationStreet(String locationStreet) {
        this.locationStreet = locationStreet;
    }
    public String getLocationDetail() {
        return locationDetail;
    }
    public void setLocationDetail(String locationDetail) {
        this.locationDetail = locationDetail;
    }
    public String getLocationCity() {
        return locationCity;
    }
    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }
    public String getLocationState() {
        return locationState;
    }
    public void setLocationState(String locationState) {
        this.locationState = locationState;
    }
    public String getLocationZip() {
        return locationZip;
    }
    public void setLocationZip(String locationZip) {
        this.locationZip = locationZip;
    }
    public String getHomepageUrl() {
        return homepageUrl;
    }
    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }
    public String getNavigatorUrl() {
        return navigatorUrl;
    }
    public void setNavigatorUrl(String navigatorUrl) {
        this.navigatorUrl = navigatorUrl;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getImpact() {
        return impact;
    }
    public void setImpact(String impact) {
        this.impact = impact;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public String getPercent() {
        return percent;
    }
    public void setPercent(String percent) {
        this.percent = percent;
    }

    @Exclude
    public Map<String, Object> toParameterMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("ein", ein);
        map.put("name", name );
        map.put("locationStreet", locationStreet);
        map.put("locationDetail", locationDetail);
        map.put("locationCity", locationCity);
        map.put("locationState", locationState);
        map.put("locationZip", locationZip);
        map.put("homepageUrl", homepageUrl);
        map.put("navigatorUrl", navigatorUrl);
        map.put("phone", phone);
        map.put("email", email);
        map.put("impact", impact);
        map.put("type", type);
        map.put("frequency", frequency);
        map.put("percent", percent);
        return map;
    }
}