package Core;

import Abstractions.ItemGenerator;
import Rewards.Diamond.DiamondGenerator;
import Rewards.Emerald.EmeraldGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Platinum.PlatinumGenerator;
import Rewards.Ruby.RubyGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;

public class Core {
    /**
     * Логика игры
     */
    public void run(){
        List < ItemGenerator> generetorList = new ArrayList<>();
        generetorList.add(new GoldGenerator());
        generetorList.add(new SilverGenerator());
        generetorList.add(new PlatinumGenerator());
        generetorList.add(new DiamondGenerator());
        generetorList.add(new EmeraldGenerator());
        generetorList.add(new RubyGenerator());
        ItemGenerator myGenerator = generetorList.get((int) (Math.random() * generetorList.size()));
        System.out.println(myGenerator.openReward());
    }
}
