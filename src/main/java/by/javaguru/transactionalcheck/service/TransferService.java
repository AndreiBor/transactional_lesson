package by.javaguru.transactionalcheck.service;

import by.javaguru.transactionalcheck.model.TransferRestModel;
import org.springframework.transaction.annotation.Transactional;


public interface TransferService {


    boolean transfer(TransferRestModel productPaymentRestModel);

    void callRemoteServce();
}
