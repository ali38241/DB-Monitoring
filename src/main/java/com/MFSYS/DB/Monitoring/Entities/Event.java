package com.MFSYS.DB.Monitoring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;

@MappedSuperclass
public abstract class Event {
	
	@Id
	private int pet_eventcode;
	private String pet_eventdesc;
	private int system_generated;
	
	public int getPet_eventcode() {
		return pet_eventcode;
	}
	public void setPet_eventcode(int pet_eventcode) {
		this.pet_eventcode = pet_eventcode;
	}
	public String getPet_eventdesc() {
		return pet_eventdesc;
	}
	public void setPet_eventdesc(String pet_eventdesc) {
		this.pet_eventdesc = pet_eventdesc;
	}
	public int getSystem_gen() {
		return system_generated;
	}
	public void setSystem_generated(int system_generated) {
		this.system_generated = system_generated;
	}
	
	
	public Event(int pet_eventcode, String pet_eventdesc, int system_gen) {
		super();
		this.pet_eventcode = pet_eventcode;
		this.pet_eventdesc = pet_eventdesc;
		this.system_generated = system_gen;
	}
	public Event() {
		super();
	}
	 @Entity
	 @Table(schema="loan", name = "pr_gn_le_loanevents")
	 public static class LoanEvent extends Event{
	 	public LoanEvent() {
	 		
	 	}
	 }
	 @Entity
	 @Table(schema="deposit", name="pr_gn_de_depositevents")
	 public static class DepositEvent extends Event{
		 public DepositEvent() {
		 		
		 	}
	 }
	 @Entity
	 @Table(schema="generalledger", name="pr_gn_ge_glevents")
	 public static class GeneralledgerEvent extends Event{
		 public GeneralledgerEvent() {
		 		
		 	}
	 }
	
	
}