package common;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.shape.Rectangle;

public class Avatar extends Rectangle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6120420598924373703L;
	private int avatarID;
	private int playerID;
	private double x;
	private double y;
	private ArrayList<Avatar> avatars;
	private int pathID;
	
	public void moveAvatar(double x, double y){
		this.setLayoutX(x);
		this.setLayoutY(y);
		this.x = x;
		this.y = y;
	}
	
	public void setPathID(int pathID){
		this.pathID = pathID;
		
	}
	
	public int getPathID(){
		return pathID;
	}
	
	public int getAvatarID(){
		return avatarID;
	}
	
	public void setAvatarID(int avatarID){
		this.avatarID = avatarID;
	}
	
	public ArrayList<Avatar> getAvatars(){
		return avatars;
	}
	
	public int getPlayerID(){
		return playerID;
	}
	
	public double getAvatarX(){
		return x;
	}
	
	public double getAvatarY(){
		return y;
	}
	


	
	
}
