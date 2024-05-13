package com.TechnoSignia.azown.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Owner {
	
	@Id
		long id;
	
		String name;
		long contact;
		String email;
		
		
		@OneToOne
		Address address;
		
		@OneToMany
		List<Property> properties;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getContact() {
			return contact;
		}

		public void setContact(long contact) {
			this.contact = contact;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public List<Property> getProperties() {
			return properties;
		}

		public void setProperties(List<Property> properties) {
			this.properties = properties;
		}		
}
