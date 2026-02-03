package com.example.stardew_almanac.gifts;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "gifts")
public class Gift {
    protected int villagerId;
    protected String name;
    protected int friendshipPoints;
    protected boolean isLoved;
    protected boolean isLiked;
    protected boolean isNeutral;
    protected boolean isDisliked;
    protected boolean isHated;

    public Gift(int villagerId, String name, int friendshipPoints, boolean isLoved, boolean isLiked, boolean isNeutral,
            boolean isDisliked, boolean isHated) {
        this.villagerId = villagerId;
        this.name = name;
        this.friendshipPoints = friendshipPoints;
        this.isLoved = isLoved;
        this.isLiked = isLiked;
        this.isNeutral = isNeutral;
        this.isDisliked = isDisliked;
        this.isHated = isHated;
    }

    public Gift() {
    }
}
