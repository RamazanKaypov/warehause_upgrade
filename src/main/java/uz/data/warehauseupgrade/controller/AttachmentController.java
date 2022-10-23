package uz.data.warehauseupgrade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.data.warehauseupgrade.entity.Attachment;
import uz.data.warehauseupgrade.service.AttachmentService;
import uz.data.warehauseupgrade.service.Result;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService service;

    @GetMapping("/{id}")
    public Attachment getById(Integer id){
        return service.getById(id);
    }

    @PostMapping
    public ResponseEntity<Result> add(@RequestBody Attachment attachment){
        Result result = service.create(attachment);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

}
