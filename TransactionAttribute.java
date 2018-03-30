package com.tutorialspoint.txn.required;

import javax.ejb.*

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class UserDetailBean implements UserDetailRemote {

    private UserDetail;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void createUserDetail() {
        //create user details object
    }
}