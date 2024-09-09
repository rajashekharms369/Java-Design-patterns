package org.example;

public class LoanApprover {
    Asset asset;
    LoanStatus loanStatus;

    public LoanApprover() {
        asset = new Asset();
        loanStatus = new LoanStatus();
    }

    public String CheckLoanEligibility(Persom person, double claimAmount) {
        String status = " Approved";
        String reason = "";
        System.out.println("\nChecking thne loan approval status of " + person.name);
        System.out.println("[The current asset value: " + person.assetValue + ",\nmClaim amount: " +
                ",\n existing loan?: " + person.previousLoanExists + " ]\nm");
        if(!asset.hasSufficientAssetValue(person, claimAmount)){
            status = " Not Approved.";
            reason = "\n An old loan exists";
        }
        // Collecting the remarks if any.
        String remarks = String.format("%nRemarks if any:%s", reason);
        //Combining the final result with remarks using
        //the format() method.
        String result = String.format("%s %s", status, remarks);
        // Same as
        // String result = status+\nRemarks if any:"+reason
        return result;
    }
}
