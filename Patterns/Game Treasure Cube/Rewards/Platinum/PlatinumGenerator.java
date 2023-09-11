package Rewards.Platinum;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class PlatinumGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new PlatinumRewards();
    }
}
