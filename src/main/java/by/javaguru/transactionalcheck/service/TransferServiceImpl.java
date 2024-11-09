package by.javaguru.transactionalcheck.service;

import by.javaguru.transactionalcheck.api.TransferServiceException;
import by.javaguru.transactionalcheck.model.TransferRestModel;
import by.javaguru.transactionalcheck.persistence.TransferEntity;
import by.javaguru.transactionalcheck.persistence.TransferRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.function.Supplier;


@Service
public class TransferServiceImpl implements TransferService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private final TransferRepository transferRepository;


    public TransferServiceImpl(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @Transactional
    @Override
    public boolean transfer(TransferRestModel transferRestModel) {
        LOGGER.info("Start transfer method");

        try {

            TransferEntity transferEntity = new TransferEntity();
            BeanUtils.copyProperties(transferRestModel, transferEntity); // т.к. поля одинаковые - обычно это делает mapper

            transferRepository.save(transferEntity);

            LOGGER.info("Transfer method callRemoteServce");
            callRemoteServce();



        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            throw new TransferServiceException(ex);
        }

        LOGGER.info("Finish transfer method");
        return true;
    }


    public void callRemoteServce() {
        LOGGER.info("CallRemoteServce method");
    }
}
