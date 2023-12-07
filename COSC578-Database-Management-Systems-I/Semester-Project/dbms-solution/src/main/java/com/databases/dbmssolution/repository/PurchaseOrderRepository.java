/**
 * PURCHASE ORDER REPOSITORY CLASS
 * 
 * @author Emmanuel Taylor
 * @author Kwaku Addow
 * @author So Ra Jang
 * @author Leonard Tangban
 * @author Keith Maina
 * 
 * @description
 *    This class represents the repository to hold Purchase Order objects
 *    that are intially loaded into the database.
 * 
 * @packages
 *    Spring Framework Data Repository (CrudRepository)
 *    DBMS Solution Entity (PurchaseOrder)
 */

package com.databases.dbmssolution.repository;

import org.springframework.data.repository.CrudRepository;
import com.databases.dbmssolution.entity.PurchaseOrder;

public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Long> {
    
}
