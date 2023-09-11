package Rewards.Emerald;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class EmeraldGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new EmeraldRewards();
    }
}
