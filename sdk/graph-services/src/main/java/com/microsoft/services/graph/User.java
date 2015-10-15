/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;


import com.microsoft.services.orc.core.ODataStream;



/**
 * The type User.
*/
public class User extends DirectoryObject {

    public User(){
        setODataType("#Microsoft.Graph.User");
    }
            
    private Boolean accountEnabled;
     
    /**
    * Gets the account Enabled.
    *
    * @return the Boolean
    */
    public Boolean getAccountEnabled() {
        return this.accountEnabled; 
    }

    /**
    * Sets the account Enabled.
    *
    * @param value the Boolean
    */
    public void setAccountEnabled(Boolean value) { 
        this.accountEnabled = value; 
        valueChanged("accountEnabled", value);

    }
    
        
    private java.util.List<AssignedLicense> assignedLicenses = null;
    
    
     
    /**
    * Gets the assigned Licenses.
    *
    * @return the java.util.List<AssignedLicense>
    */
    public java.util.List<AssignedLicense> getAssignedLicenses() {
        return this.assignedLicenses; 
    }

    /**
    * Sets the assigned Licenses.
    *
    * @param value the java.util.List<AssignedLicense>
    */
    public void setAssignedLicenses(java.util.List<AssignedLicense> value) { 
        this.assignedLicenses = value; 
        valueChanged("assignedLicenses", value);

    }
    
        
    private java.util.List<AssignedPlan> assignedPlans = null;
    
    
     
    /**
    * Gets the assigned Plans.
    *
    * @return the java.util.List<AssignedPlan>
    */
    public java.util.List<AssignedPlan> getAssignedPlans() {
        return this.assignedPlans; 
    }

    /**
    * Sets the assigned Plans.
    *
    * @param value the java.util.List<AssignedPlan>
    */
    public void setAssignedPlans(java.util.List<AssignedPlan> value) { 
        this.assignedPlans = value; 
        valueChanged("assignedPlans", value);

    }
            
    private String city;
     
    /**
    * Gets the city.
    *
    * @return the String
    */
    public String getCity() {
        return this.city; 
    }

    /**
    * Sets the city.
    *
    * @param value the String
    */
    public void setCity(String value) { 
        this.city = value; 
        valueChanged("city", value);

    }
            
    private String country;
     
    /**
    * Gets the country.
    *
    * @return the String
    */
    public String getCountry() {
        return this.country; 
    }

    /**
    * Sets the country.
    *
    * @param value the String
    */
    public void setCountry(String value) { 
        this.country = value; 
        valueChanged("country", value);

    }
            
    private String department;
     
    /**
    * Gets the department.
    *
    * @return the String
    */
    public String getDepartment() {
        return this.department; 
    }

    /**
    * Sets the department.
    *
    * @param value the String
    */
    public void setDepartment(String value) { 
        this.department = value; 
        valueChanged("department", value);

    }
            
    private Boolean dirSyncEnabled;
     
    /**
    * Gets the dir Sync Enabled.
    *
    * @return the Boolean
    */
    public Boolean getDirSyncEnabled() {
        return this.dirSyncEnabled; 
    }

    /**
    * Sets the dir Sync Enabled.
    *
    * @param value the Boolean
    */
    public void setDirSyncEnabled(Boolean value) { 
        this.dirSyncEnabled = value; 
        valueChanged("dirSyncEnabled", value);

    }
            
    private String displayName;
     
    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.displayName = value; 
        valueChanged("displayName", value);

    }
            
    private String facsimileTelephoneNumber;
     
    /**
    * Gets the facsimile Telephone Number.
    *
    * @return the String
    */
    public String getFacsimileTelephoneNumber() {
        return this.facsimileTelephoneNumber; 
    }

    /**
    * Sets the facsimile Telephone Number.
    *
    * @param value the String
    */
    public void setFacsimileTelephoneNumber(String value) { 
        this.facsimileTelephoneNumber = value; 
        valueChanged("facsimileTelephoneNumber", value);

    }
            
    private String givenName;
     
    /**
    * Gets the given Name.
    *
    * @return the String
    */
    public String getGivenName() {
        return this.givenName; 
    }

    /**
    * Sets the given Name.
    *
    * @param value the String
    */
    public void setGivenName(String value) { 
        this.givenName = value; 
        valueChanged("givenName", value);

    }
            
    private String immutableId;
     
    /**
    * Gets the immutable Id.
    *
    * @return the String
    */
    public String getImmutableId() {
        return this.immutableId; 
    }

    /**
    * Sets the immutable Id.
    *
    * @param value the String
    */
    public void setImmutableId(String value) { 
        this.immutableId = value; 
        valueChanged("immutableId", value);

    }
            
    private String jobTitle;
     
    /**
    * Gets the job Title.
    *
    * @return the String
    */
    public String getJobTitle() {
        return this.jobTitle; 
    }

    /**
    * Sets the job Title.
    *
    * @param value the String
    */
    public void setJobTitle(String value) { 
        this.jobTitle = value; 
        valueChanged("jobTitle", value);

    }
            
    private java.util.Calendar lastDirSyncTime;
     
    /**
    * Gets the last Dir Sync Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastDirSyncTime() {
        return this.lastDirSyncTime; 
    }

    /**
    * Sets the last Dir Sync Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastDirSyncTime(java.util.Calendar value) { 
        this.lastDirSyncTime = value; 
        valueChanged("lastDirSyncTime", value);

    }
            
    private String mail;
     
    /**
    * Gets the mail.
    *
    * @return the String
    */
    public String getMail() {
        return this.mail; 
    }

    /**
    * Sets the mail.
    *
    * @param value the String
    */
    public void setMail(String value) { 
        this.mail = value; 
        valueChanged("mail", value);

    }
            
    private String mailNickname;
     
    /**
    * Gets the mail Nickname.
    *
    * @return the String
    */
    public String getMailNickname() {
        return this.mailNickname; 
    }

    /**
    * Sets the mail Nickname.
    *
    * @param value the String
    */
    public void setMailNickname(String value) { 
        this.mailNickname = value; 
        valueChanged("mailNickname", value);

    }
            
    private String mobile;
     
    /**
    * Gets the mobile.
    *
    * @return the String
    */
    public String getMobile() {
        return this.mobile; 
    }

    /**
    * Sets the mobile.
    *
    * @param value the String
    */
    public void setMobile(String value) { 
        this.mobile = value; 
        valueChanged("mobile", value);

    }
            
    private String onPremisesSecurityIdentifier;
     
    /**
    * Gets the on Premises Security Identifier.
    *
    * @return the String
    */
    public String getOnPremisesSecurityIdentifier() {
        return this.onPremisesSecurityIdentifier; 
    }

    /**
    * Sets the on Premises Security Identifier.
    *
    * @param value the String
    */
    public void setOnPremisesSecurityIdentifier(String value) { 
        this.onPremisesSecurityIdentifier = value; 
        valueChanged("onPremisesSecurityIdentifier", value);

    }
    
        
    private java.util.List<String> otherMails = null;
    
    
     
    /**
    * Gets the other Mails.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getOtherMails() {
        return this.otherMails; 
    }

    /**
    * Sets the other Mails.
    *
    * @param value the java.util.List<String>
    */
    public void setOtherMails(java.util.List<String> value) { 
        this.otherMails = value; 
        valueChanged("otherMails", value);

    }
            
    private String passwordPolicies;
     
    /**
    * Gets the password Policies.
    *
    * @return the String
    */
    public String getPasswordPolicies() {
        return this.passwordPolicies; 
    }

    /**
    * Sets the password Policies.
    *
    * @param value the String
    */
    public void setPasswordPolicies(String value) { 
        this.passwordPolicies = value; 
        valueChanged("passwordPolicies", value);

    }
            
    private PasswordProfile passwordProfile;
     
    /**
    * Gets the password Profile.
    *
    * @return the PasswordProfile
    */
    public PasswordProfile getPasswordProfile() {
        return this.passwordProfile; 
    }

    /**
    * Sets the password Profile.
    *
    * @param value the PasswordProfile
    */
    public void setPasswordProfile(PasswordProfile value) { 
        this.passwordProfile = value; 
        valueChanged("passwordProfile", value);

    }
            
    private String physicalDeliveryOfficeName;
     
    /**
    * Gets the physical Delivery Office Name.
    *
    * @return the String
    */
    public String getPhysicalDeliveryOfficeName() {
        return this.physicalDeliveryOfficeName; 
    }

    /**
    * Sets the physical Delivery Office Name.
    *
    * @param value the String
    */
    public void setPhysicalDeliveryOfficeName(String value) { 
        this.physicalDeliveryOfficeName = value; 
        valueChanged("physicalDeliveryOfficeName", value);

    }
            
    private String postalCode;
     
    /**
    * Gets the postal Code.
    *
    * @return the String
    */
    public String getPostalCode() {
        return this.postalCode; 
    }

    /**
    * Sets the postal Code.
    *
    * @param value the String
    */
    public void setPostalCode(String value) { 
        this.postalCode = value; 
        valueChanged("postalCode", value);

    }
            
    private String preferredLanguage;
     
    /**
    * Gets the preferred Language.
    *
    * @return the String
    */
    public String getPreferredLanguage() {
        return this.preferredLanguage; 
    }

    /**
    * Sets the preferred Language.
    *
    * @param value the String
    */
    public void setPreferredLanguage(String value) { 
        this.preferredLanguage = value; 
        valueChanged("preferredLanguage", value);

    }
    
        
    private java.util.List<ProvisionedPlan> provisionedPlans = null;
    
    
     
    /**
    * Gets the provisioned Plans.
    *
    * @return the java.util.List<ProvisionedPlan>
    */
    public java.util.List<ProvisionedPlan> getProvisionedPlans() {
        return this.provisionedPlans; 
    }

    /**
    * Sets the provisioned Plans.
    *
    * @param value the java.util.List<ProvisionedPlan>
    */
    public void setProvisionedPlans(java.util.List<ProvisionedPlan> value) { 
        this.provisionedPlans = value; 
        valueChanged("provisionedPlans", value);

    }
    
        
    private java.util.List<ProvisioningError> provisioningErrors = null;
    
    
     
    /**
    * Gets the provisioning Errors.
    *
    * @return the java.util.List<ProvisioningError>
    */
    public java.util.List<ProvisioningError> getProvisioningErrors() {
        return this.provisioningErrors; 
    }

    /**
    * Sets the provisioning Errors.
    *
    * @param value the java.util.List<ProvisioningError>
    */
    public void setProvisioningErrors(java.util.List<ProvisioningError> value) { 
        this.provisioningErrors = value; 
        valueChanged("provisioningErrors", value);

    }
    
        
    private java.util.List<String> proxyAddresses = null;
    
    
     
    /**
    * Gets the proxy Addresses.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getProxyAddresses() {
        return this.proxyAddresses; 
    }

    /**
    * Sets the proxy Addresses.
    *
    * @param value the java.util.List<String>
    */
    public void setProxyAddresses(java.util.List<String> value) { 
        this.proxyAddresses = value; 
        valueChanged("proxyAddresses", value);

    }
            
    private String sipProxyAddress;
     
    /**
    * Gets the sip Proxy Address.
    *
    * @return the String
    */
    public String getSipProxyAddress() {
        return this.sipProxyAddress; 
    }

    /**
    * Sets the sip Proxy Address.
    *
    * @param value the String
    */
    public void setSipProxyAddress(String value) { 
        this.sipProxyAddress = value; 
        valueChanged("sipProxyAddress", value);

    }
            
    private String state;
     
    /**
    * Gets the state.
    *
    * @return the String
    */
    public String getState() {
        return this.state; 
    }

    /**
    * Sets the state.
    *
    * @param value the String
    */
    public void setState(String value) { 
        this.state = value; 
        valueChanged("state", value);

    }
            
    private String streetAddress;
     
    /**
    * Gets the street Address.
    *
    * @return the String
    */
    public String getStreetAddress() {
        return this.streetAddress; 
    }

    /**
    * Sets the street Address.
    *
    * @param value the String
    */
    public void setStreetAddress(String value) { 
        this.streetAddress = value; 
        valueChanged("streetAddress", value);

    }
            
    private String surname;
     
    /**
    * Gets the surname.
    *
    * @return the String
    */
    public String getSurname() {
        return this.surname; 
    }

    /**
    * Sets the surname.
    *
    * @param value the String
    */
    public void setSurname(String value) { 
        this.surname = value; 
        valueChanged("surname", value);

    }
            
    private String telephoneNumber;
     
    /**
    * Gets the telephone Number.
    *
    * @return the String
    */
    public String getTelephoneNumber() {
        return this.telephoneNumber; 
    }

    /**
    * Sets the telephone Number.
    *
    * @param value the String
    */
    public void setTelephoneNumber(String value) { 
        this.telephoneNumber = value; 
        valueChanged("telephoneNumber", value);

    }
            
    private ODataStream thumbnailPhoto;
     
    /**
    * Gets the thumbnail Photo.
    *
    * @return the ODataStream
    */
    public ODataStream getThumbnailPhoto() {
        return this.thumbnailPhoto; 
    }

    /**
    * Sets the thumbnail Photo.
    *
    * @param value the ODataStream
    */
    public void setThumbnailPhoto(ODataStream value) { 
        this.thumbnailPhoto = value; 
        valueChanged("thumbnailPhoto", value);

    }
            
    private String usageLocation;
     
    /**
    * Gets the usage Location.
    *
    * @return the String
    */
    public String getUsageLocation() {
        return this.usageLocation; 
    }

    /**
    * Sets the usage Location.
    *
    * @param value the String
    */
    public void setUsageLocation(String value) { 
        this.usageLocation = value; 
        valueChanged("usageLocation", value);

    }
            
    private String userPrincipalName;
     
    /**
    * Gets the user Principal Name.
    *
    * @return the String
    */
    public String getUserPrincipalName() {
        return this.userPrincipalName; 
    }

    /**
    * Sets the user Principal Name.
    *
    * @param value the String
    */
    public void setUserPrincipalName(String value) { 
        this.userPrincipalName = value; 
        valueChanged("userPrincipalName", value);

    }
            
    private String userType;
     
    /**
    * Gets the user Type.
    *
    * @return the String
    */
    public String getUserType() {
        return this.userType; 
    }

    /**
    * Sets the user Type.
    *
    * @param value the String
    */
    public void setUserType(String value) { 
        this.userType = value; 
        valueChanged("userType", value);

    }
            
    private java.util.UUID MailboxGuid;
     
    /**
    * Gets the Mailbox Guid.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getMailboxGuid() {
        return this.MailboxGuid; 
    }

    /**
    * Sets the Mailbox Guid.
    *
    * @param value the java.util.UUID
    */
    public void setMailboxGuid(java.util.UUID value) { 
        this.MailboxGuid = value; 
        valueChanged("MailboxGuid", value);

    }
            
    private String aboutMe;
     
    /**
    * Gets the about Me.
    *
    * @return the String
    */
    public String getAboutMe() {
        return this.aboutMe; 
    }

    /**
    * Sets the about Me.
    *
    * @param value the String
    */
    public void setAboutMe(String value) { 
        this.aboutMe = value; 
        valueChanged("aboutMe", value);

    }
            
    private String alias;
     
    /**
    * Gets the alias.
    *
    * @return the String
    */
    public String getAlias() {
        return this.alias; 
    }

    /**
    * Sets the alias.
    *
    * @param value the String
    */
    public void setAlias(String value) { 
        this.alias = value; 
        valueChanged("alias", value);

    }
            
    private java.util.Calendar birthday;
     
    /**
    * Gets the birthday.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getBirthday() {
        return this.birthday; 
    }

    /**
    * Sets the birthday.
    *
    * @param value the java.util.Calendar
    */
    public void setBirthday(java.util.Calendar value) { 
        this.birthday = value; 
        valueChanged("birthday", value);

    }
            
    private java.util.Calendar hireDate;
     
    /**
    * Gets the hire Date.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getHireDate() {
        return this.hireDate; 
    }

    /**
    * Sets the hire Date.
    *
    * @param value the java.util.Calendar
    */
    public void setHireDate(java.util.Calendar value) { 
        this.hireDate = value; 
        valueChanged("hireDate", value);

    }
    
        
    private java.util.List<String> interests = null;
    
    
     
    /**
    * Gets the interests.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getInterests() {
        return this.interests; 
    }

    /**
    * Sets the interests.
    *
    * @param value the java.util.List<String>
    */
    public void setInterests(java.util.List<String> value) { 
        this.interests = value; 
        valueChanged("interests", value);

    }
            
    private String mySite;
     
    /**
    * Gets the my Site.
    *
    * @return the String
    */
    public String getMySite() {
        return this.mySite; 
    }

    /**
    * Sets the my Site.
    *
    * @param value the String
    */
    public void setMySite(String value) { 
        this.mySite = value; 
        valueChanged("mySite", value);

    }
    
        
    private java.util.List<String> pastProjects = null;
    
    
     
    /**
    * Gets the past Projects.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getPastProjects() {
        return this.pastProjects; 
    }

    /**
    * Sets the past Projects.
    *
    * @param value the java.util.List<String>
    */
    public void setPastProjects(java.util.List<String> value) { 
        this.pastProjects = value; 
        valueChanged("pastProjects", value);

    }
            
    private String preferredName;
     
    /**
    * Gets the preferred Name.
    *
    * @return the String
    */
    public String getPreferredName() {
        return this.preferredName; 
    }

    /**
    * Sets the preferred Name.
    *
    * @param value the String
    */
    public void setPreferredName(String value) { 
        this.preferredName = value; 
        valueChanged("preferredName", value);

    }
            
    private String principalName;
     
    /**
    * Gets the principal Name.
    *
    * @return the String
    */
    public String getPrincipalName() {
        return this.principalName; 
    }

    /**
    * Sets the principal Name.
    *
    * @param value the String
    */
    public void setPrincipalName(String value) { 
        this.principalName = value; 
        valueChanged("principalName", value);

    }
    
        
    private java.util.List<String> responsibilities = null;
    
    
     
    /**
    * Gets the responsibilities.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getResponsibilities() {
        return this.responsibilities; 
    }

    /**
    * Sets the responsibilities.
    *
    * @param value the java.util.List<String>
    */
    public void setResponsibilities(java.util.List<String> value) { 
        this.responsibilities = value; 
        valueChanged("responsibilities", value);

    }
    
        
    private java.util.List<String> schools = null;
    
    
     
    /**
    * Gets the schools.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getSchools() {
        return this.schools; 
    }

    /**
    * Sets the schools.
    *
    * @param value the java.util.List<String>
    */
    public void setSchools(java.util.List<String> value) { 
        this.schools = value; 
        valueChanged("schools", value);

    }
    
        
    private java.util.List<String> skills = null;
    
    
     
    /**
    * Gets the skills.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getSkills() {
        return this.skills; 
    }

    /**
    * Sets the skills.
    *
    * @param value the java.util.List<String>
    */
    public void setSkills(java.util.List<String> value) { 
        this.skills = value; 
        valueChanged("skills", value);

    }
    
        
    private java.util.List<String> tags = null;
    
    
     
    /**
    * Gets the tags.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getTags() {
        return this.tags; 
    }

    /**
    * Sets the tags.
    *
    * @param value the java.util.List<String>
    */
    public void setTags(java.util.List<String> value) { 
        this.tags = value; 
        valueChanged("tags", value);

    }
    
        
    private java.util.List<AppRoleAssignment> appRoleAssignments = null;
    
    
     
    /**
    * Gets the app Role Assignments.
    *
    * @return the java.util.List<AppRoleAssignment>
    */
    public java.util.List<AppRoleAssignment> getAppRoleAssignments() {
        return this.appRoleAssignments; 
    }

    /**
    * Sets the app Role Assignments.
    *
    * @param value the java.util.List<AppRoleAssignment>
    */
    public void setAppRoleAssignments(java.util.List<AppRoleAssignment> value) { 
        this.appRoleAssignments = value; 
        valueChanged("appRoleAssignments", value);

    }
    
        
    private java.util.List<OAuth2PermissionGrant> oauth2PermissionGrants = null;
    
    
     
    /**
    * Gets the oauth2Permission Grants.
    *
    * @return the java.util.List<OAuth2PermissionGrant>
    */
    public java.util.List<OAuth2PermissionGrant> getOauth2PermissionGrants() {
        return this.oauth2PermissionGrants; 
    }

    /**
    * Sets the oauth2Permission Grants.
    *
    * @param value the java.util.List<OAuth2PermissionGrant>
    */
    public void setOauth2PermissionGrants(java.util.List<OAuth2PermissionGrant> value) { 
        this.oauth2PermissionGrants = value; 
        valueChanged("oauth2PermissionGrants", value);

    }
    
        
    private java.util.List<DirectoryObject> ownedDevices = null;
    
    
     
    /**
    * Gets the owned Devices.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getOwnedDevices() {
        return this.ownedDevices; 
    }

    /**
    * Sets the owned Devices.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setOwnedDevices(java.util.List<DirectoryObject> value) { 
        this.ownedDevices = value; 
        valueChanged("ownedDevices", value);

    }
    
        
    private java.util.List<DirectoryObject> registeredDevices = null;
    
    
     
    /**
    * Gets the registered Devices.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getRegisteredDevices() {
        return this.registeredDevices; 
    }

    /**
    * Sets the registered Devices.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setRegisteredDevices(java.util.List<DirectoryObject> value) { 
        this.registeredDevices = value; 
        valueChanged("registeredDevices", value);

    }
            
    private DirectoryObject manager;
     
    /**
    * Gets the manager.
    *
    * @return the DirectoryObject
    */
    public DirectoryObject getManager() {
        return this.manager; 
    }

    /**
    * Sets the manager.
    *
    * @param value the DirectoryObject
    */
    public void setManager(DirectoryObject value) { 
        this.manager = value; 
        valueChanged("manager", value);

    }
    
        
    private java.util.List<DirectoryObject> directReports = null;
    
    
     
    /**
    * Gets the direct Reports.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getDirectReports() {
        return this.directReports; 
    }

    /**
    * Sets the direct Reports.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setDirectReports(java.util.List<DirectoryObject> value) { 
        this.directReports = value; 
        valueChanged("directReports", value);

    }
    
        
    private java.util.List<DirectoryObject> memberOf = null;
    
    
     
    /**
    * Gets the member Of.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.memberOf; 
    }

    /**
    * Sets the member Of.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setMemberOf(java.util.List<DirectoryObject> value) { 
        this.memberOf = value; 
        valueChanged("memberOf", value);

    }
    
        
    private java.util.List<DirectoryObject> createdObjects = null;
    
    
     
    /**
    * Gets the created Objects.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getCreatedObjects() {
        return this.createdObjects; 
    }

    /**
    * Sets the created Objects.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setCreatedObjects(java.util.List<DirectoryObject> value) { 
        this.createdObjects = value; 
        valueChanged("createdObjects", value);

    }
    
        
    private java.util.List<DirectoryObject> ownedObjects = null;
    
    
     
    /**
    * Gets the owned Objects.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getOwnedObjects() {
        return this.ownedObjects; 
    }

    /**
    * Sets the owned Objects.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setOwnedObjects(java.util.List<DirectoryObject> value) { 
        this.ownedObjects = value; 
        valueChanged("ownedObjects", value);

    }
    
        
    private java.util.List<MailFolder> Folders = null;
    
    
     
    /**
    * Gets the Folders.
    *
    * @return the java.util.List<MailFolder>
    */
    public java.util.List<MailFolder> getFolders() {
        return this.Folders; 
    }

    /**
    * Sets the Folders.
    *
    * @param value the java.util.List<MailFolder>
    */
    public void setFolders(java.util.List<MailFolder> value) { 
        this.Folders = value; 
        valueChanged("Folders", value);

    }
    
        
    private java.util.List<Message> Messages = null;
    
    
     
    /**
    * Gets the Messages.
    *
    * @return the java.util.List<Message>
    */
    public java.util.List<Message> getMessages() {
        return this.Messages; 
    }

    /**
    * Sets the Messages.
    *
    * @param value the java.util.List<Message>
    */
    public void setMessages(java.util.List<Message> value) { 
        this.Messages = value; 
        valueChanged("Messages", value);

    }
    
        
    private java.util.List<Calendar> Calendars = null;
    
    
     
    /**
    * Gets the Calendars.
    *
    * @return the java.util.List<Calendar>
    */
    public java.util.List<Calendar> getCalendars() {
        return this.Calendars; 
    }

    /**
    * Sets the Calendars.
    *
    * @param value the java.util.List<Calendar>
    */
    public void setCalendars(java.util.List<Calendar> value) { 
        this.Calendars = value; 
        valueChanged("Calendars", value);

    }
            
    private Calendar Calendar;
     
    /**
    * Gets the Calendar.
    *
    * @return the Calendar
    */
    public Calendar getCalendar() {
        return this.Calendar; 
    }

    /**
    * Sets the Calendar.
    *
    * @param value the Calendar
    */
    public void setCalendar(Calendar value) { 
        this.Calendar = value; 
        valueChanged("Calendar", value);

    }
    
        
    private java.util.List<CalendarGroup> CalendarGroups = null;
    
    
     
    /**
    * Gets the Calendar Groups.
    *
    * @return the java.util.List<CalendarGroup>
    */
    public java.util.List<CalendarGroup> getCalendarGroups() {
        return this.CalendarGroups; 
    }

    /**
    * Sets the Calendar Groups.
    *
    * @param value the java.util.List<CalendarGroup>
    */
    public void setCalendarGroups(java.util.List<CalendarGroup> value) { 
        this.CalendarGroups = value; 
        valueChanged("CalendarGroups", value);

    }
    
        
    private java.util.List<Event> Events = null;
    
    
     
    /**
    * Gets the Events.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getEvents() {
        return this.Events; 
    }

    /**
    * Sets the Events.
    *
    * @param value the java.util.List<Event>
    */
    public void setEvents(java.util.List<Event> value) { 
        this.Events = value; 
        valueChanged("Events", value);

    }
    
        
    private java.util.List<Event> CalendarView = null;
    
    
     
    /**
    * Gets the Calendar View.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getCalendarView() {
        return this.CalendarView; 
    }

    /**
    * Sets the Calendar View.
    *
    * @param value the java.util.List<Event>
    */
    public void setCalendarView(java.util.List<Event> value) { 
        this.CalendarView = value; 
        valueChanged("CalendarView", value);

    }
    
        
    private java.util.List<Contact> Contacts = null;
    
    
     
    /**
    * Gets the Contacts.
    *
    * @return the java.util.List<Contact>
    */
    public java.util.List<Contact> getContacts() {
        return this.Contacts; 
    }

    /**
    * Sets the Contacts.
    *
    * @param value the java.util.List<Contact>
    */
    public void setContacts(java.util.List<Contact> value) { 
        this.Contacts = value; 
        valueChanged("Contacts", value);

    }
    
        
    private java.util.List<ContactFolder> ContactFolders = null;
    
    
     
    /**
    * Gets the Contact Folders.
    *
    * @return the java.util.List<ContactFolder>
    */
    public java.util.List<ContactFolder> getContactFolders() {
        return this.ContactFolders; 
    }

    /**
    * Sets the Contact Folders.
    *
    * @param value the java.util.List<ContactFolder>
    */
    public void setContactFolders(java.util.List<ContactFolder> value) { 
        this.ContactFolders = value; 
        valueChanged("ContactFolders", value);

    }
            
    private Photo UserPhoto;
     
    /**
    * Gets the User Photo.
    *
    * @return the Photo
    */
    public Photo getUserPhoto() {
        return this.UserPhoto; 
    }

    /**
    * Sets the User Photo.
    *
    * @param value the Photo
    */
    public void setUserPhoto(Photo value) { 
        this.UserPhoto = value; 
        valueChanged("UserPhoto", value);

    }
    
        
    private java.util.List<File> TrendingAround = null;
    
    
     
    /**
    * Gets the Trending Around.
    *
    * @return the java.util.List<File>
    */
    public java.util.List<File> getTrendingAround() {
        return this.TrendingAround; 
    }

    /**
    * Sets the Trending Around.
    *
    * @param value the java.util.List<File>
    */
    public void setTrendingAround(java.util.List<File> value) { 
        this.TrendingAround = value; 
        valueChanged("TrendingAround", value);

    }
    
        
    private java.util.List<User> WorkingWith = null;
    
    
     
    /**
    * Gets the Working With.
    *
    * @return the java.util.List<User>
    */
    public java.util.List<User> getWorkingWith() {
        return this.WorkingWith; 
    }

    /**
    * Sets the Working With.
    *
    * @param value the java.util.List<User>
    */
    public void setWorkingWith(java.util.List<User> value) { 
        this.WorkingWith = value; 
        valueChanged("WorkingWith", value);

    }
    
        
    private java.util.List<Group> JoinedGroups = null;
    
    
     
    /**
    * Gets the Joined Groups.
    *
    * @return the java.util.List<Group>
    */
    public java.util.List<Group> getJoinedGroups() {
        return this.JoinedGroups; 
    }

    /**
    * Sets the Joined Groups.
    *
    * @param value the java.util.List<Group>
    */
    public void setJoinedGroups(java.util.List<Group> value) { 
        this.JoinedGroups = value; 
        valueChanged("JoinedGroups", value);

    }
            
    private Drive drive;
     
    /**
    * Gets the drive.
    *
    * @return the Drive
    */
    public Drive getDrive() {
        return this.drive; 
    }

    /**
    * Sets the drive.
    *
    * @param value the Drive
    */
    public void setDrive(Drive value) { 
        this.drive = value; 
        valueChanged("drive", value);

    }
    
        
    private java.util.List<Task> tasks = null;
    
    
     
    /**
    * Gets the tasks.
    *
    * @return the java.util.List<Task>
    */
    public java.util.List<Task> getTasks() {
        return this.tasks; 
    }

    /**
    * Sets the tasks.
    *
    * @param value the java.util.List<Task>
    */
    public void setTasks(java.util.List<Task> value) { 
        this.tasks = value; 
        valueChanged("tasks", value);

    }
    
        
    private java.util.List<Plan> plans = null;
    
    
     
    /**
    * Gets the plans.
    *
    * @return the java.util.List<Plan>
    */
    public java.util.List<Plan> getPlans() {
        return this.plans; 
    }

    /**
    * Sets the plans.
    *
    * @param value the java.util.List<Plan>
    */
    public void setPlans(java.util.List<Plan> value) { 
        this.plans = value; 
        valueChanged("plans", value);

    }
}

