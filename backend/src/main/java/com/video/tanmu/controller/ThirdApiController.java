package com.video.tanmu.controller;

import com.video.tanmu.constants.ResponseCode;
import com.video.tanmu.model.UserModel;
import com.video.tanmu.result.Response;
import com.video.tanmu.service.ThirdCollectionService;
import com.video.tanmu.vo.TaskInfoVo;
import com.video.tanmu.vo.ThirdCollectionApiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/admin/collection")
public class ThirdApiController {
    @Value("${collection.url}")
    private String collectionUrl;

    @Autowired
    private ThirdCollectionService thirdCollectionService;
    @RequestMapping("/getAll")
    @ResponseBody
    public Response<List<ThirdCollectionApiVo>> selectAll( UserModel userModel){
        if (null == userModel) {
            return new Response(ResponseCode.NOT_LOGIN);
        }
        return thirdCollectionService.selectAll();
    }
    @RequestMapping("/updateOrCreate")
    @ResponseBody
    public Response<Integer> updateOrCreate(ThirdCollectionApiVo thirdCollectionApiVo){
        return thirdCollectionService.updateOrCreate(thirdCollectionApiVo);
    }

    @RequestMapping("/startTask")
    public Response<String> startTask(@RequestParam("key") String key, UserModel userModel){
        if (null == userModel) {
            return new Response(ResponseCode.NOT_LOGIN);
        }
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(collectionUrl + "/api/collectionVideo/start_task?key=" + key, String.class);
        return Response.success(result);
    }
    @RequestMapping("/getTaskByKey")
    public Response<TaskInfoVo> get_task_by_key(@RequestParam("key") String key){
        RestTemplate restTemplate = new RestTemplate();
        TaskInfoVo taskInfoVo = restTemplate.getForObject(collectionUrl + "/api/collectionVideo/get_task_by_key?key=" + key, TaskInfoVo.class);
        return Response.success(taskInfoVo);
    }
}
