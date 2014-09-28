package com.example.maraudersmap;

import org.json.JSONException;
import org.json.JSONObject;

public class Person {
	private String name;
	private int id, bearing;
	private double lat, lng;
	private boolean isMoving;
	
	public Person(String name, int id, double lat, double lng, int bearing){
		this.setName(name);
		this.id = id;
		this.lat = lat;
		this.lng = lng;
		this.setBearing(bearing);
	}

	public void update(JSONObject person) {
		try {
			lat = person.getDouble("lat");
			lng = person.getDouble("lng");
		} catch (JSONException e) {
		}
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public int getBearing() {
		return bearing;
	}

	public void setBearing(int bearing) {
		this.bearing = bearing;
	}
	
}
