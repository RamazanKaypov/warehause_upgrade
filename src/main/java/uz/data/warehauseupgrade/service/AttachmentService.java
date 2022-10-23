package uz.data.warehauseupgrade.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.data.warehauseupgrade.entity.Attachment;
import uz.data.warehauseupgrade.repository.AttachmentRepository;

import java.util.Optional;

@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;

    public Attachment getById(Integer id){
        Optional<Attachment> byId = attachmentRepository.findById(id);
        return byId.orElse(null);
    }

    public Result create(Attachment attachment){
        attachmentRepository.save(attachment);
        return new Result("Successfully added!",true,201);
    }
}
