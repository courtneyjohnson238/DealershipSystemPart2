package com.yearup.dealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {

   public void saveContract (Contract contract) {
      try (BufferedWriter bw = new BufferedWriter(new FileWriter("contracts.csv",true))) {
         if (contract instanceof SalesContract){
            bw.write("SALES" + "|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" +
                    contract.getVehicleSold().getVin() + "|" + contract.getVehicleSold().getYear() + "|" + contract.getVehicleSold().getMake()
             + "|" + contract.getVehicleSold().getModel() + "|" + contract.getVehicleSold().getVehicleType() + "|" + contract.getVehicleSold()
                    .getColor() + "|" + contract.getVehicleSold().getOdometer() + "|" + contract.getVehicleSold().getPrice() + "|" + ((SalesContract) contract).getSalesTaxAmount() +
                    "|" + ((SalesContract) contract).getRecordingFee() + "|" + ((SalesContract) contract).getProcessingFee() + "|" + contract.getTotalPrice() + "|" + ((SalesContract) contract).isFinancing()
            + "|" + contract.getMonthlyPayment());
         } else if (contract instanceof LeaseContract) {
            bw.write("LEASE" + "|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" +
                    contract.getVehicleSold().getVin() + "|" + contract.getVehicleSold().getYear() + "|" + contract.getVehicleSold().getMake()
                    + "|" + contract.getVehicleSold().getModel() + "|" + contract.getVehicleSold().getVehicleType() + "|" + contract.getVehicleSold()
                    .getColor() + "|" + contract.getVehicleSold().getOdometer() + "|" + contract.getVehicleSold().getPrice() + "|" + ((LeaseContract) contract).getExpectedEndingValue() + "|"
                     + ((LeaseContract) contract).getLeaseFee() + "|" + contract.getTotalPrice() + "|" + contract.getMonthlyPayment());
         }
         bw.newLine();


      } catch (IOException e) {
         e.printStackTrace();


      }
   }}
