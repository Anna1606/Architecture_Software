package Rewards.Platinum;

import Abstractions.IGameItem;

public class PlatinumRewards implements IGameItem {
    @Override
    public String open() {
        return "Platinum";
    }
}
