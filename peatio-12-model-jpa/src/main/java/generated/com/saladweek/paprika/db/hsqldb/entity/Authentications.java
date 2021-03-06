package generated.com.saladweek.paprika.db.hsqldb.entity;
// Generated 2018. 2. 7 오전 6:10:08 by Hibernate Tools 5.0.6.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Authentications generated by hbm2java
 */
@Entity
@Table(name="authentications"
)
public class Authentications  implements java.io.Serializable {


     private int id;
     private String provider;
     private String uid;
     private String token;
     private String secret;
     private Integer memberId;
     private Date createdAt;
     private Date updatedAt;
     private String nickname;

    public Authentications() {
    }

	
    public Authentications(int id) {
        this.id = id;
    }
    public Authentications(int id, String provider, String uid, String token, String secret, Integer memberId, Date createdAt, Date updatedAt, String nickname) {
       this.id = id;
       this.provider = provider;
       this.uid = uid;
       this.token = token;
       this.secret = secret;
       this.memberId = memberId;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.nickname = nickname;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="provider")
    public String getProvider() {
        return this.provider;
    }
    
    public void setProvider(String provider) {
        this.provider = provider;
    }

    
    @Column(name="uid")
    public String getUid() {
        return this.uid;
    }
    
    public void setUid(String uid) {
        this.uid = uid;
    }

    
    @Column(name="token")
    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    
    @Column(name="secret")
    public String getSecret() {
        return this.secret;
    }
    
    public void setSecret(String secret) {
        this.secret = secret;
    }

    
    @Column(name="member_id")
    public Integer getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at", length=19)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_at", length=19)
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    
    @Column(name="nickname")
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }




}


