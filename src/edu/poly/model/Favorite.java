package edu.poly.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the Favorites database table.
 * 
 */
@Entity
@Table(name="Favorites")
@NamedQuery(name="Favorite.findAll", query="SELECT f FROM Favorite f")
public class Favorite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FavoritedId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int favoritedId;

	@Column(name="LikedDate")
	private Date likedDate;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="Username")
	private User user;

	//bi-directional many-to-one association to Video
	@ManyToOne
	@JoinColumn(name="VideoId")
	private Video video;

	public Favorite() {
	}

	public int getFavoritedId() {
		return this.favoritedId;
	}

	public void setFavoritedId(int favoritedId) {
		this.favoritedId = favoritedId;
	}

	public Date getLikedDate() {
		return this.likedDate;
	}

	public void setLikedDate(Date likedDate) {
		this.likedDate = likedDate;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Video getVideo() {
		return this.video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}