package com.company.composition;

import java.util.Objects;

public class RewardsMember {

    private boolean rewardsMember;

    public RewardsMember() {
    }

    public RewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    //getters and setters
    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardsMember that = (RewardsMember) o;
        return rewardsMember == that.rewardsMember;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewardsMember);
    }

    @Override
    public String toString() {
        return "RewardsMember{" +
                "rewardsMember=" + rewardsMember +
                '}';
    }
}
