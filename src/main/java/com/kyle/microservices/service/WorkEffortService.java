package com.kyle.microservices.service;

import com.kyle.microservices.beans.WorkEffort;
import com.kyle.microservices.service.getWorkEfforts.EevalWorkEffort;
import com.kyle.microservices.service.getWorkEfforts.GetWorkEfforts;
import com.kyle.microservices.service.getWorkEfforts.GetWorkEffortsPortType;
import com.kyle.microservices.service.getWorkEfforts.MapMap;
import com.kyle.microservices.utils.ConverterHandler;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Created by Kyle on 6/25/2017.
 */
@Service
public class WorkEffortService {
    private Logger logger = Logger.getLogger(WorkEffortService.class.getName());
    private static final QName SERVICE_NAME = new QName("http://ofbiz.apache.org/service/", "getWorkEfforts");

    public List<WorkEffort> getWorkEfforts() {
        URL wsdlURL = GetWorkEfforts.WSDL_LOCATION;

        GetWorkEfforts ss = new GetWorkEfforts(wsdlURL, SERVICE_NAME);
        GetWorkEffortsPortType port = ss.getGetWorkEffortsPort();

        logger.info("Invoking getWorkEfforts...");
        MapMap _getWorkEfforts_mapMap = new MapMap();
        MapMap _getWorkEfforts__return = port.getWorkEfforts(_getWorkEfforts_mapMap);

        ConverterHandler<WorkEffort, EevalWorkEffort> converterHandler = new ConverterHandler<>();
        List<WorkEffort> workEfforts = null;
        if (_getWorkEfforts__return != null && _getWorkEfforts__return.getMapEntry() != null && _getWorkEfforts__return.getMapEntry().size() > 0) {

            List<EevalWorkEffort> eevalWorkEfforts = _getWorkEfforts__return.getMapEntry().get(0).getMapValue().getColLinkedList().getEevalWorkEffort();

            if (eevalWorkEfforts != null && eevalWorkEfforts.size() > 0) {
                workEfforts = converterHandler.convertSoap2Object(eevalWorkEfforts, soapTolocalFun);
            }
        }


        return workEfforts;
    }

    Function<EevalWorkEffort, WorkEffort> soapTolocalFun = new Function<EevalWorkEffort, WorkEffort>() {
        @Override
        public WorkEffort apply(EevalWorkEffort item) {
            WorkEffort workEffort = new WorkEffort();
            if (item.getWorkEffortId() != null)
                workEffort.setWorkEffortId(item.getWorkEffortId());
            if (item.getAccommodationMapId() != null)
                workEffort.setAccommodationMapId(item.getAccommodationMapId());
            if (item.getAccommodationSpotId() != null)
                workEffort.setAccommodationSpotId(item.getAccommodationSpotId());
            if (item.getActualCompletionDate() != null)
                workEffort.setActualCompletionDate(item.getActualCompletionDate());
            if (item.getActualMilliSeconds() != null)
                workEffort.setActualMilliSeconds(item.getActualMilliSeconds());
            if (item.getActualSetupMillis() != null)
                workEffort.setActualSetupMillis(item.getActualSetupMillis());
            if (item.getActualStartDate() != null)
                workEffort.setActualStartDate(item.getActualStartDate());
            if (item.getCreatedByUserLogin() != null)
                workEffort.setCreatedByUserLogin(item.getCreatedByUserLogin());
            if (item.getCreatedDate() != null)
                workEffort.setCreatedDate(item.getCreatedDate());
            if (item.getCreatedStamp() != null)
                workEffort.setCreatedStamp(item.getCreatedStamp());
            if (item.getCreatedTxStamp() != null)
                workEffort.setCreatedTxStamp(item.getCreatedTxStamp());
            if (item.getCurrentStatusId() != null)
                workEffort.setCurrentStatusId(item.getCurrentStatusId());
            if (item.getDescription() != null)
                workEffort.setDescription(item.getDescription());
            if (item.getEstimateCalcMethod() != null)
                workEffort.setEstimateCalcMethod(item.getEstimateCalcMethod());
            if (item.getEstimatedCompletionDate() != null)
                workEffort.setEstimatedCompletionDate(item.getEstimatedCompletionDate());
            if (item.getEstimatedMilliSeconds() != null)
                workEffort.setEstimatedMilliSeconds(item.getEstimatedMilliSeconds());
            if (item.getEstimatedSetupMillis() != null)
                workEffort.setEstimatedSetupMillis(item.getEstimatedSetupMillis());
            if (item.getEstimatedStartDate() != null)
                workEffort.setEstimatedStartDate(item.getEstimatedStartDate());
            if (item.getFacilityId() != null)
                workEffort.setFacilityId(item.getFacilityId());
            if (item.getFixedAssetId() != null)
                workEffort.setFixedAssetId(item.getFixedAssetId());
            if (item.getInfoUrl() != null)
                workEffort.setInfoUrl(item.getInfoUrl());
            if (item.getLastModifiedByUserLogin() != null)
                workEffort.setLastModifiedByUserLogin(item.getLastModifiedByUserLogin());
            if (item.getLastModifiedDate() != null)
                workEffort.setLastModifiedDate(item.getLastModifiedDate());
            if (item.getLastStatusUpdate() != null)
                workEffort.setLastStatusUpdate(item.getLastStatusUpdate());

            if (item.getLastUpdatedStamp() != null)
                workEffort.setLastUpdatedStamp(item.getLastUpdatedStamp());
            if (item.getLastUpdatedTxStamp() != null)
                workEffort.setLastUpdatedTxStamp(item.getLastUpdatedTxStamp());
            if (item.getLocationDesc() != null)
                workEffort.setLocationDesc(item.getLocationDesc());
            if (item.getMoneyUomId() != null)
                workEffort.setMoneyUomId(item.getMoneyUomId());
            if (item.getNoteId() != null)
                workEffort.setNoteId(item.getNoteId());
            if (item.getPercentComplete() != null)
                workEffort.setPercentComplete(item.getPercentComplete());
            if (item.getPriority() != null)
                workEffort.setPriority(item.getPriority());
            if (item.getLastStatusUpdate() != null)
                workEffort.setLastStatusUpdate(item.getLastStatusUpdate());
            return workEffort;
        }
    };
}
