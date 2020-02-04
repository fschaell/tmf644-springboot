package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.EventSubscription;
import io.swagger.model.PartyPrivacyAgreementAttributeValueChangeEvent;
import io.swagger.model.PartyPrivacyAgreementCreateEvent;
import io.swagger.model.PartyPrivacyAgreementDeleteEvent;
import io.swagger.model.PartyPrivacyAgreementStatusChangeEvent;
import io.swagger.model.PartyPrivacyProfileAttributeValueChangeEvent;
import io.swagger.model.PartyPrivacyProfileCreateEvent;
import io.swagger.model.PartyPrivacyProfileDeleteEvent;
import io.swagger.model.PartyPrivacyProfileSpecificationAttributeValueChangeEvent;
import io.swagger.model.PartyPrivacyProfileSpecificationCreateEvent;
import io.swagger.model.PartyPrivacyProfileSpecificationDeleteEvent;
import io.swagger.model.PartyPrivacyProfileSpecificationStatusChangeEvent;
import io.swagger.model.PartyPrivacyProfileStatusChangeEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-04T08:29:47.551Z")

@Controller
public class ListenerApiController implements ListenerApi {

    private static final Logger log = LoggerFactory.getLogger(ListenerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ListenerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyAgreementAttributeValueChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyAgreementAttributeValueChangeEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyAgreementCreateEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyAgreementCreateEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyAgreementDeleteEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyAgreementDeleteEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyAgreementStatusChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyAgreementStatusChangeEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyProfileAttributeValueChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileAttributeValueChangeEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyProfileCreateEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileCreateEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyProfileDeleteEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileDeleteEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyProfileSpecificationAttributeValueChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileSpecificationAttributeValueChangeEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyProfileSpecificationCreateEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileSpecificationCreateEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyProfileSpecificationDeleteEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileSpecificationDeleteEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyProfileSpecificationStatusChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileSpecificationStatusChangeEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToPartyPrivacyProfileStatusChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileStatusChangeEvent data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

}
