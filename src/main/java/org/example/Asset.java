package org.example;

public class Asset {
    public boolean hasSufficientAssetValue(Persom person, double claimAmount){
        System.out.println("Veryfying "+person.name+" asset value.");
        return person.assetValue >= claimAmount;
    }
}
